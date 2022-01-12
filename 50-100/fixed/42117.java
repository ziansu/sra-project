private static void moveNode(javafx.scene.input.MouseEvent event, javafx.scene.Node node) {
    image.markup.view.MouseEvents.curX = event.getSceneX();
    image.markup.view.MouseEvents.curY = event.getSceneY();
    double dX = (image.markup.view.MouseEvents.curX) - (image.markup.view.MouseEvents.prevX);
    double dY = (image.markup.view.MouseEvents.curY) - (image.markup.view.MouseEvents.prevY);
    if (node instanceof image.markup.view.shapes.InteractiveRect) {
        image.markup.view.MouseEvents.shiftInBounds(event, dX, dY);
        event.consume();
    }
}