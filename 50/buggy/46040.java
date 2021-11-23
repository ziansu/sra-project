public void message(java.awt.Graphics g) {
    g.clearRect(0, 0, Game.WIDTH, Game.HEIGHT);
    g.drawImage(background, 0, 0, null);
    g.drawImage(gameOver, 220, 180, null);
}