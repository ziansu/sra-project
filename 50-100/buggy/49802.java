@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    if ((img) == null)
        return ;
    
    java.awt.Graphics2D g2 = ((java.awt.Graphics2D) (g));
    java.awt.geom.AffineTransform tran = java.awt.geom.AffineTransform.getScaleInstance(scale, scale);
    g2.drawImage(img, tran, null);
    paintInPanel(tran, g2);
}