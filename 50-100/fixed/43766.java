public final void display() {
    java.lang.System.out.println("\n**********************************************************************");
    java.lang.System.out.println("**                          OPTIONS  MENU                            **");
    java.lang.System.out.println("**********************************************************************\n");
    for (int i = 0; i < (battleship260_05.OptionsMenuView.menuItems.length); i++) {
        java.lang.System.out.println((((("\t" + (battleship260_05.OptionsMenuView.menuItems[i][0])) + " ") + (battleship260_05.OptionsMenuView.menuItems[i][1])) + "\n"));
    }
    java.lang.System.out.println();
    java.lang.System.out.println("Please select option: ");
}