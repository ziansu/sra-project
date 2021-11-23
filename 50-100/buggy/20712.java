@java.lang.Override
public void paint(java.awt.Graphics g) {
    g.setColor(getBackground());
    g.clearRect(0, 0, getWidth(), getHeight());
    if (fadeTimer)
        ((java.awt.Graphics2D) (g)).setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, fade));
    
    g.drawImage(img, 0, 0, this);
    g.dispose();
}