public boolean turnMenu() {
    showMessage("What would you like to do?");
    java.lang.String[] options = new java.lang.String[]{ "Look" , "Move" , "Shoot" , "Game Options" };
    int choice = displayMenu(options);
    switch (choice) {
        case 0 :
            askLook();
            return true;
        case 1 :
            askMove();
            return true;
        case 2 :
            askShoot();
            return false;
        case 3 :
            openOptions();
            return false;
    }
    return false;
}