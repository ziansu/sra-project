@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    float xf = e.getX();
    float yf = e.getY();
    int x = x2Coordinate(xf);
    int y = y2Coordinate(yf);
    com.icool.go.Coordinate c = new com.icool.go.Coordinate(x, y);
    char color = currTurn;
    com.icool.go.Stone s = new com.icool.go.Stone(c, color);
    putStone(s);
    update(getGraphics());
    if (canToggle) {
        toogle();
    }
}