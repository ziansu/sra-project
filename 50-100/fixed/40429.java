public void renderBackground(com.badlogic.gdx.graphics.g2d.SpriteBatch batch) {
    if ((backColor) != null) {
        batch.begin();
        shapeRenderer.begin(ShapeType.Filled);
        shapeRenderer.setColor(backColor.r, backColor.g, backColor.b, backColorOpacity);
        com.badlogic.gdx.math.Vector2 temp = getAbsolutePosition();
        shapeRenderer.rect(temp.x, temp.y, size.x, size.y);
        shapeRenderer.end();
        batch.end();
    }
}