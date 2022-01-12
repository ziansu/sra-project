private void dispatchEventHandler(EventHandler handler, MouseInfo mouse, boolean isFront) {
    assert handler != null;
    if (mouse != null) {
        if (handler instanceof BaseActor) {
            handler.onMouseIn(mouse);
            handler.onMouseOut(mouse);
        }
        handler.onMouseDown(mouse);
        handler.onMouseUp(mouse);
        handler.onMouseClicked(mouse);
        handler.onMouseMoved(mouse);
        handler.onMouseDragged(mouse);
        handler.onMouseDragging(mouse);
    }
}