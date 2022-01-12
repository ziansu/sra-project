public void update() throws org.newdawn.slick.SlickException {
    tPlayer.update();
    this.alienUpdate();
    this.checkCollision();
    if (tLevel.hasWon()) {
        if (hasNextLevel()) {
            nextLevel();
        }else {
            tWon = true;
            highScoreManager.addScores(tScore);
            java.lang.System.out.println(highScoreManager.toString());
        }
    }
}