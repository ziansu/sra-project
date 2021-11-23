public void render(java.awt.Graphics2D g) {
    g.setColor(java.awt.Color.blue);
    g.fillRect(((x) - ((int) (gamestate.State.xOffset))), ((y) - ((int) (gamestate.State.yOffset))), width, height);
}