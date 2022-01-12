@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    mouseX = e.getX();
    mouseY = e.getY();
    if (paused) {
        resume();
    }else {
        pause();
    }
}