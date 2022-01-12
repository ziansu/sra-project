private void dispatchEventHandler(EventHandler handler, MouseInfo mouse, boolean isFront) {
    assert handler != null;
    assert mouse != null;
    if (handler instanceof BaseActor) {
        handler.onMouseIn();
        handler.onMouseOut();
    }
    handler.onMouseDown();
    handler.onMouseUp();
    handler.onMouseClicked();
    handler.onMouseMoved();
    handler.onMouseDragged();
    handler.onMouseDragging();
}