public javafx.scene.shape.Box ground() {
    javafx.scene.shape.Box ground = new javafx.scene.shape.Box(3500, 5, 1200);
    ground.setTranslateX(480);
    ground.setTranslateY(1200);
    ground.setTranslateZ(800);
    ground.setMaterial(img.getTexture(13));
    return ground;
}