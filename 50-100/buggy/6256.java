public void paint(java.awt.Graphics g) {
    java.awt.image.BufferedImage image = new java.awt.image.BufferedImage(100, 100, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED);
    image.createGraphics().setColor(getForekground());
    image.createGraphics().fillRect(0, 0, 100, 100);
    doll.render(image);
    g.drawImage(image, 100, 100, null);
    java.lang.System.out.println("RagCanvas::paint()");
    return ;
}