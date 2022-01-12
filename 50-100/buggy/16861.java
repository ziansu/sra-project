protected void processMouseMotionEvent(java.awt.event.MouseEvent event) {
    if ((mouseDown) != (Piano.MOUSE_RELEASED)) {
        for (int i = 0; i < (keys); i++) {
            if (keyTable[i].mouseInBounds(event.getX(), event.getY())) {
                setMouseDown((i + (lowestNote)));
                return ;
            }
        }
    }
    setMouseDown(Piano.MOUSE_RELEASED);
}