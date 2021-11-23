public void menu(ver0.PlayerActor character) {
    java.lang.System.out.println("Welcome to the Library");
    boolean exit = false;
    while (!exit) {
        java.lang.System.out.println("1)Learn Skills");
        java.lang.System.out.println("2)Leave");
        select = myScanner.nextInt();
        if ((select) == 1) {
            learnSkills(character);
        }else
            if ((select) == 2) {
                exit = true;
                return ;
            }else {
                java.lang.System.out.println("Sorry we didn't understand your input, please enter a number");
            }
        
    } 
    return ;
}