public void relocateToPoint(javafx.geometry.Point2D p) {
    javafx.geometry.Point2D localCoords = getParent().sceneToLocal(p);
    relocate(((int) (localCoords.getX())), ((int) (localCoords.getY())));
}