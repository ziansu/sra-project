public static void main(java.lang.String[] args) {
    Main.createGUI();
    Main.keyboard = new java.util.Scanner(java.lang.System.in);
    Main.getAIPayers();
    while (!(Main.gameWon)) {
        if ((Main.currentPlayer) == (Main.BLACK))
            Main.blackMove();
        else
            Main.redMove();
        
        Main.vboard.update();
    } 
}