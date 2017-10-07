package keyfinal;
//here we cretaed pacakage as keyfinal which that organizes a set of related classes and interfaces.
public class Week {

	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		 dailyclass dailyclass=new dailyclass(); //new dailyclass                          
         lateclass lateclass =new lateclass(); //new lateclass
     
         dailyclass.display(); //displays dailyclass
         lateclass.display(); //displays lateclass                   
        }
}
// if i have taken the weeks class as final and that class cannot be extended another subclass because we declared it has final                                  

  class dailyclass{                                        
	  //here I'm taking the sub class name as Weeks 
      //here i am showing the use of a final keyword in the variables
   
 	  final int Time =10;                        
 	  //and i have taken an integer variable  as days =7 and i declared it as final  
                                                    
 	  //and as if i have taken days =8 after declaring the variable has final the compiler shows an error that after assigning a variable has final it cannot change in whole programme 
	public  void display(){                           //here i created a method to show  and it displays the output
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		

	  
		
		System.out.println("Daily class is at"+Time);    
		//and final variables cannot be changed .if we initialized blank variables has final then we can assign them by using the constructors
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
	
	}
}     
  //  here I'm taking another class Months which extends the Weeks class
                                                  
  //and here I'm showing the use of final in methods 
      class lateclass extends dailyclass{//extends weeks
     	 
	          public final void display (){     
	        	//Here public is a access modifier which defines who can access this method
	      		//void is used to define return type of the method,void means method wont return any value                                     //here i'm taking the method as final in the above class and i'm trying to extend the weeks class  with months class 
		
		 System.out.println("today class will be late");      
		 //now it shows an error in this line that if we declared a method as final it cannot be override
		//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.
	 }  
}