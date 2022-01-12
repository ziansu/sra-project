public int updateOptions(java.util.Scanner in) {
    boolean select = false;
    int option = 0;
    while (!select) {
        java.lang.System.out.println("=======================================================================================================");
        java.lang.System.out.println("What would you like to update?");
        java.lang.System.out.println("1. Guests");
        java.lang.System.out.println("2. Upgrade the room");
        option = in.nextInt();
        if ((option < 1) || (option > 2)) {
            java.lang.System.out.println("=======================================================================================================");
            java.lang.System.out.println("Error: That wasn't a valid choice. Please try again.");
        }else
            select = true;
        
    } 
    return option;
}