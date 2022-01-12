public void renderBackground(com.badlogic.gdx.graphics.g2d.SpriteBatch batch) {
    if (visible) {
        if ((backColor) != null) {
            shapeRenderer.begin(ShapeType.Filled);
            shapeRenderer.setColor(backColor.r, backColor.g, backColor.b, backColorOpacity);
            com.badlogic.gdx.math.Vector2 temp = getAbsolutePosition();
            shapeRenderer.rect(temp.x, temp.y, size.x, size.y);
            shapeRenderer.end();
        }
        for (com.icnhdevelopment.wotn.gui.Container child : children) {
            child.renderBackground(batch);
        }
    }
}