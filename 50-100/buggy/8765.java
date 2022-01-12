@java.lang.Override
public void gameOver() {
    java.lang.String playername = ((java.lang.String) (javax.swing.JOptionPane.showInputDialog(null, ((("Your score: " + (_panel.gameModel().step())) + "\n") + "Enter your name:\n"), "Game Over", javax.swing.JOptionPane.PLAIN_MESSAGE, null, null, "new player")));
    _scoreBoard.put(_panel.gameModel().step(), playername);
}