void addMouseEventHandlers(boolean horizontalAllowed) {
    setOnMousePressed(getOnPressedHandler());
    setOnMouseDragged(getOnDraggedHandler(horizontalAllowed));
    java.lang.System.out.println(horizontalAllowed);
    setOnMouseReleased(getOnreleaseHandler());
    setOnMouseMoved(getOnMouseMovedHandler());
}