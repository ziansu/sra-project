public void draw(org.newdawn.slick.Graphics graphics) throws com.sem.btrouble.view.SlickException {
    drawBackground(graphics);
    drawCountDown(graphics);
    drawPlayers(graphics);
    drawPowers(graphics);
    drawBubbles(graphics);
    drawTimer(graphics);
    drawBorders(graphics);
    drawLives();
    drawScore(graphics);
}