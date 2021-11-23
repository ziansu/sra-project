void addMouseEventHandlers(boolean horizontalAllowed) {
    setOnMousePressed(getOnPressedHandler());
    setOnMouseDragged(getOnDraggedHandler(horizontalAllowed));
    setOnMouseReleased(getOnreleaseHandler());
    setOnMouseMoved(getOnMouseMovedHandler());
}