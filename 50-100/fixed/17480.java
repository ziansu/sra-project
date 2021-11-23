@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.awt.image.BufferedImage image = new java.awt.image.BufferedImage(512, 512, java.awt.image.BufferedImage.TYPE_INT_RGB);
    java.awt.Graphics2D g = image.createGraphics();
    g.setColor(java.awt.Color.WHITE);
    g.fillOval(128, 128, 256, 256);
    ((ar.com.itba.frame.MainWindow) (parent)).updateLeftQuickDrawPanel(image);
}