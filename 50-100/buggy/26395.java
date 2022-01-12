public void init() {
    bank.init();
    java.awt.Graphics2D g = bank.img1[0].createGraphics();
    this.setFocusable(true);
    this.requestFocus();
    try {
        javax.imageio.ImageIO.write(bank.img1[0], "PNG", new java.io.File("C:\\Users\\Josh\\workspace\\Test\\000.png"));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    bi = bank.img1[0];
    paintComponent(g);
}