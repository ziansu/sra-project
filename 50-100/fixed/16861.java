protected void processMouseMotionEvent(java.awt.event.MouseEvent event) {
    int x = event.getX();
    int y = event.getY();
    if ((mouseDown) != (Piano.MOUSE_RELEASED)) {
        for (int i = 0; i < (keys); i++) {
            if (keyTable[i].mouseInBounds(x, y)) {
                setMouseDown((i + (lowestNote)));
                return ;
            }
        }
    }
    setMouseDown(Piano.MOUSE_RELEASED);
}