public final void display() {
    java.lang.System.out.println("\n\t===============================================================");
    java.lang.System.out.println("\nPick a Number/Letter associated with one of the following commands:");
    for (int i = 0; i < (this.menuItems.length); i++) {
        java.lang.System.out.print(("\t   " + (battleship.Menu.menuItems[i][0])));
        if (i == 2)
            break;
        
        java.lang.System.out.println(("\t   " + (battleship.Menu.menuItems[0][i])));
    }
    java.lang.System.out.println("\n\t===============================================================\n");
}