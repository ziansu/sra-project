private int getEmployeeID(java.util.Scanner console) {
    boolean run = true;
    int num = -1;
    while (run) {
        hotelmgmt.UserView.speak("Enter the employee ID Number");
        if (console.hasNextInt()) {
            num = console.nextInt();
            console.nextLine();
            if (num > 0)
                run = false;
            else
                hotelmgmt.UserView.speak("Value must be positive.");
            
        }else
            hotelmgmt.UserView.speak("Please enter an integer value");
        
    } 
    return num;
}