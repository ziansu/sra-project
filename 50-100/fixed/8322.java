private java.lang.String setEndOfLevel(int numLives) {
    pp.startGame(level.getLevel());
    bg.setBackgroundImage(bg.getBackGroundImageFileName());
    if ((this.count) > 0)
        bg.getNextBackGroundImageFileName();
    
    msg.setGameStart(level.getLevel(), level.getLives());
    level.newLevel(numLives);
    return "Level Finished";
}