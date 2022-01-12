private void chooseUserTypeMenuView() {
    java.lang.System.out.println("\nChoose what type of user you are");
    java.lang.System.out.println("1 - Author");
    java.lang.System.out.println("2 - SubProgram Chair");
    myUserChoice = myScanner.next();
    if (myUserChoice.equals("1")) {
        setChanged();
        notifyObservers("AUTHOR");
    }else
        if (myUserChoice.equals("2")) {
            setChanged();
            notifyObservers("SUBPROGRAM_CHAIR");
        }else {
            java.lang.System.out.println("Invalid choice, please select from the options displayed");
            chooseUserTypeMenuView();
        }
    
}