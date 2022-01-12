private void receiveStates() throws java.io.IOException {
    for (int i = 0; i < 50; i++) {
        java.awt.image.BufferedImage a = javax.imageio.ImageIO.read(new java.io.File((("" + i) + ".jpg")));
        java.awt.Image img = a.getScaledInstance(736, 568, java.awt.Image.SCALE_SMOOTH);
        this.states.add(new javax.swing.ImageIcon(img));
    }
}