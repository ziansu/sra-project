@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
    closeWindow();
    gui.gameManager.acceptChallenge(challengeNumber, game);
}