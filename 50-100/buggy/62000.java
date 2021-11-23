@java.lang.Override
public void paint(java.awt.Graphics graphics) {
    java.awt.Graphics2D g = ((java.awt.Graphics2D) (graphics));
    g.setBackground(getBackground());
    g.clearRect(0, 0, getWidth(), getHeight());
    g.drawImage(controller.getImage(), null, 0, 0);
}