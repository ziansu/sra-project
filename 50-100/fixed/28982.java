public void paint(java.awt.Graphics g) {
    java.awt.Graphics2D g2d = ((java.awt.Graphics2D) (g));
    g2d.drawImage(image.getImage(), 0, 0, image.getImage().getWidth(), image.getImage().getHeight(), null);
}