private void gameRender() {
    im = createImage(getWidth(), getHeight());
    java.awt.Graphics g = im.getGraphics();
    bg.draw(g);
    player.draw(g);
    g.setFont(new java.awt.Font("Courier New", java.awt.Font.PLAIN, 12));
    g.setColor(java.awt.Color.BLACK);
    frameRate.calculate();
    g.drawString(frameRate.getFrameRate(), 20, 20);
    java.lang.System.out.println("rendering");
}