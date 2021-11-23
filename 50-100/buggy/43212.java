@java.lang.Override
public void render(float delta) {
    clearScreen();
    shapeRenderer.setProjectionMatrix(camera.projection);
    shapeRenderer.setTransformMatrix(camera.view);
    shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
    flappy.drawDebug(shapeRenderer);
    for (dk.brams.flappybee.Flower flower : flowers) {
        flower.drawDebug(shapeRenderer);
    }
    shapeRenderer.end();
    draw();
    update(delta);
}