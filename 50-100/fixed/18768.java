private void updateUI() {
    gameFrame.updateUI(gameBoard);
    if ((this.score) > (logic.Game.highScore.getScore())) {
        logic.Game.highScore.setScore(this.score);
    }
    gameFrame.setScore(this.score);
    gameFrame.setBest(logic.Game.highScore.getScore());
}