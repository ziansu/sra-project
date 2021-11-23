public javafx.scene.shape.Box ground() {
    javafx.scene.shape.Box ground = new javafx.scene.shape.Box(3500, 5, 1200);
    ground.setTranslateX(480);
    ground.setTranslateY(800);
    ground.setTranslateZ(1300);
    ground.setMaterial(img.getTexture(13));
    return ground;
}