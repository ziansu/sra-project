public final void display() {
    java.lang.System.out.println("\n\t===============================================================");
    java.lang.System.out.println("\nPick a Number/Letter associated with one of the following commands:");
    for (int i = 0; i < (this.menuItems.length); i++) {
        java.lang.System.out.println(((("\t   " + (battleship.Menu.menuItems[i][0])) + "\t") + (battleship.Menu.menuItems[i][1])));
    }
    java.lang.System.out.println("\n\t===============================================================\n");
}