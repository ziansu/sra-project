public void moveToMouse(java.awt.event.MouseEvent e) {
    if ((getGrid().isMouseInsideGrid(e)) == true) {
        int newX = getMousePosition(e);
        if (newX != (-1)) {
            shiftToPosition(newX);
        }
    }
}