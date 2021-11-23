public void mouseClicked(int x, int y) {
    int posX = pos.getX();
    int posY = pos.getY();
    int h = 0;
    java.util.Iterator<net.yawk.client.gui.Component> it = components.iterator();
    while (it.hasNext()) {
        net.yawk.client.gui.Component comp = it.next();
        comp.mouseClicked(x, y, posX, (posY + h));
        h += comp.getHeight();
    } 
}