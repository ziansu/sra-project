@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent e) {
    int x = e.getX();
    int y = e.getY();
    if ((dragging) == true)
        return ;
    else {
        prevX = x;
        prevY = y;
        dragging = true;
    }
}