public void backButtonClick() {
    if ((currentPlayer) > 0) {
        gameFrame.getGame().setCurrentPlayer(((currentPlayer) - 1));
        new trivia.gui.PlayerJoinPanel(gameFrame);
    }else {
        gameFrame.getGame().reset();
        new trivia.gui.MainMenuPanel(gameFrame);
    }
}