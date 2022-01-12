@java.lang.Override
public void draw() {
    shapeRenderer.begin();
    shapeRenderer.set(ShapeRenderer.ShapeType.Line);
    shapeRenderer.setColor(Color.WHITE);
    shapeRenderer.circle(0, 0, site.petrtsv.corsairs.models.GameWorld.RADIUS);
    shapeRenderer.end();
    super.draw();
}