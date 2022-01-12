public void renderDebug(com.badlogic.gdx.graphics.glutils.ShapeRenderer shapeRenderer) {
    shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
    shapeRenderer.setColor(Color.RED);
    for (com.badlogic.gdx.math.Vector2 v : path.controlPoints) {
        shapeRenderer.circle(v.x, v.y, 5);
    }
    shapeRenderer.end();
    shapeRenderer.setColor(Color.GREEN);
    if ((intersection) != null)
        renderIntersection(shapeRenderer);
    
}