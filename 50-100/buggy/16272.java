public static void saveGame(snake.SnakeGame snakeGame) {
    try {
        java.lang.String sName = javax.swing.JOptionPane.showInputDialog(("Please input your " + "username"));
        sName = sName.trim().toLowerCase();
        java.io.ObjectOutputStream objOut = new java.io.ObjectOutputStream(new java.io.FileOutputStream((sName + "_saveGame.bin")));
        snake.StateHandler.writeVariables(snakeGame, objOut);
        objOut.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}