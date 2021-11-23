public javafx.scene.shape.Shape calcBoundingBox(int size) {
    javafx.scene.shape.Circle circleBBox = new javafx.scene.shape.Circle(((this.getTranslateX()) + (size / 2)), ((this.getTranslateY()) + (size / 2)), ((size / 2) + 4));
    circleBBox.setOpacity(0);
    return circleBBox;
}