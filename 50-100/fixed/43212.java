private void drawDebug() {
    shapeRenderer.setProjectionMatrix(camera.projection);
    shapeRenderer.setTransformMatrix(camera.view);
    shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
    flappy.drawDebug(shapeRenderer);
    for (dk.brams.flappybee.Flower flower : flowers) {
        flower.drawDebug(shapeRenderer);
    }
    shapeRenderer.end();
}