public static void main(java.lang.String[] args) throws java.lang.Exception {
    int winner = 0;
    int DISPLAY = cli.Main.setConfigurations();
    logic.Game game = new logic.Game(DISPLAY, cli.Main.GAMEMODE);
    if (DISPLAY == 1) {
    }else {
        winner = game.startGame();
    }
    if (winner == 1)
        java.lang.System.out.println("Black Won!");
    else
        if (winner == 2)
            java.lang.System.out.println("White Won!");
        
    
}