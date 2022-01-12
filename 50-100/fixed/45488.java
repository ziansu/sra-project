public java.lang.String setGameOver() {
    this.count = 0;
    level.setGameStart();
    msg.setGameOver(level.getLevel(), level.getLives());
    pp.startGame(level.getLevel());
    bg.setStart();
    this.gameOver = true;
    return "Game Over";
}