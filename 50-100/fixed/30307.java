public void searchMenu() {
    java.lang.System.out.println("Welcome to the search menu!");
    int choice = 1;
    while (choice != 0) {
        cls();
        java.lang.System.out.println("1. Search for movie");
        java.lang.System.out.println("2. Search for actor");
        choice = scan.getInt();
        switch (choice) {
            case 0 :
                break;
            case 1 :
                searchForMovie();
                break;
            case 2 :
                searchForActor();
                break;
            default :
                java.lang.System.out.println("Invalid input");
                break;
        }
    } 
}