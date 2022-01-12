public void init() {
    bank.init();
    java.awt.Graphics2D g = bank.img1[0].createGraphics();
    this.setFocusable(true);
    this.requestFocus();
    bi = bank.img1[0];
    paintComponent(g);
}