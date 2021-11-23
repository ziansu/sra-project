@java.lang.Override
public void draw() {
    com.badlogic.gdx.graphics.g2d.Batch batch = this.getBatch();
    batch.setProjectionMatrix(camera.combined);
    batch.begin();
    scoresLabel.draw(batch, 1);
    batch.end();
    shapeRenderer.begin();
    shapeRenderer.set(ShapeRenderer.ShapeType.Line);
    shapeRenderer.setColor(Color.WHITE);
    shapeRenderer.circle(0, 0, site.petrtsv.corsairs.models.GameWorld.RADIUS);
    shapeRenderer.end();
    super.draw();
}