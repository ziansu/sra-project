public void mouseClicked(int x, int y) {
    int posX = pos.getX();
    int posY = pos.getY();
    int h = 0;
    for (net.yawk.client.gui.Component comp : components) {
        comp.mouseClicked(x, y, posX, (posY + h));
        h += comp.getHeight();
    }
}