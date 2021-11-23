private void createViewCross() {
    double length = 5.0;
    double width = 0.1;
    xViewCrossAxis = new javafx.scene.shape.Box(length, width, width);
    yViewCrossAxis = new javafx.scene.shape.Box(width, length, width);
    zViewCrossAxis = new javafx.scene.shape.Box(width, width, length);
    xViewCrossAxis.setMaterial(redMaterial);
    yViewCrossAxis.setMaterial(greenMaterial);
    zViewCrossAxis.setMaterial(blueMaterial);
}