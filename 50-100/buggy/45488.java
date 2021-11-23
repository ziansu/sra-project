public java.lang.String setGameOver() {
    level.setGameStart();
    msg.setGameOver(level.getLevel(), level.getLives());
    pp.startGame(level.getLevel());
    bg.setStart();
    this.gameOver = true;
    return "Game Over";
}