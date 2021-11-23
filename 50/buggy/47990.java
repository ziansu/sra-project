@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    clicked = true;
    x = e.getX();
    y = e.getY();
    whichClicked = e.getButton();
}