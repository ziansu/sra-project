public void setViewportSize(float width, float height) {
    viewportSize.set(width, height);
    spriteBatch.getProjectionMatrix().setToOrtho2D(0, 0, width, height);
    shapeRenderer.getProjectionMatrix().setToOrtho2D(0, 0, width, height);
}