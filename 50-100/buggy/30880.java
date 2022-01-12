public static void main(java.lang.String[] args) throws java.lang.Exception {
    int DISPLAY = cli.Main.setConfigurations();
    logic.Game game = new logic.Game(DISPLAY, cli.Main.GAMEMODE);
    int winner = game.startGame();
    if (winner == 1)
        java.lang.System.out.println("Black Won!");
    else
        if (winner == 2)
            java.lang.System.out.println("White Won!");
        else
            java.lang.System.err.println("Error");
        
    
}