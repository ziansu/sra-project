@java.lang.Override
protected void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    if ((buffer) != null) {
        g.drawImage(buffer, 0, 0, this);
    }
}