private javafx.scene.shape.Circle createCircle(double radius, double x, double y) {
    final javafx.scene.shape.Circle circle = new javafx.scene.shape.Circle(radius);
    circle.setFill(javafx.scene.paint.Color.LIGHTBLUE);
    circle.relocate((x - radius), (y - radius));
    drawLine(cm.getX(), cm.getY(), 500, 500);
    return circle;
}