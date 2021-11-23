@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    mineButton.getModel().setArmed(false);
    mineButton.getModel().setPressed(false);
    if (pressed) {
        minesweeper.clickField(ii, jj, false);
    }
    pressed = false;
}