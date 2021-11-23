private java.lang.String setEndOfLevel(int numLives) {
    pp.startGame(level.getLevel());
    bg.setBackgroundImage(bg.getBackGroundImageFileName());
    if (this.gameOver)
        this.gameOver = false;
    else
        bg.getNextBackGroundImageFileName();
    
    msg.setGameStart(level.getLevel(), level.getLives());
    level.newLevel(numLives);
    return "Level Finished";
}