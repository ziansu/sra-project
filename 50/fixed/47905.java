public void init() {
    image = new java.awt.image.BufferedImage(main.GamePanel.WIDTH, main.GamePanel.HEIGHT, java.awt.image.BufferedImage.TYPE_INT_RGB);
    g = ((java.awt.Graphics2D) (image.getGraphics()));
    running = true;
    gameStateManager = new gameStates.GameStateManager(this);
}