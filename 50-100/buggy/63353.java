@java.lang.Override
public void update(java.awt.Graphics g) {
    if ((image) == null) {
        image = createImage(this.getWidth(), this.getHeight());
        second = image.getGraphics();
    }
    second.setColor(getBackground());
    second.fillRect(0, 0, getWidth(), getHeight());
    second.setColor(getForeground());
    paint(second);
    g.drawImage(image, 0, 0, this);
}