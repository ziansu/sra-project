public void backButtonClick() {
    if ((currentPlayer) > 0) {
        gameFrame.getGame().setCurrentPlayer(((currentPlayer) - 1));
        new trivia.gui.PlayerJoinPanel(gameFrame);
    }else {
        gameFrame.getGame().setCurrentPlayer(0);
        gameFrame.getGame().reset();
        new trivia.gui.MainMenuPanel(gameFrame);
    }
}