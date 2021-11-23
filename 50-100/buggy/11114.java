public void clear() {
    if ((graphics2D) != null) {
        graphics2D.setPaint(java.awt.Color.white);
        graphics2D.fillRect(0, 0, getSize().width, getSize().height);
        graphics2D.setPaint(java.awt.Color.black);
    }
    epaint();
}