public void displayContextMenu(javafx.scene.control.ContextMenu contextMenu, org.Point point, double xLocation, double yLocation) {
    contextMenu.show(circles.get(point).getScene().getWindow(), xLocation, yLocation);
    handlePoint(point);
}