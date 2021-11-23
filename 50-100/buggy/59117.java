public static com.badlogic.gdx.math.Vector2 screenToWorld(float screenX, float screenY) {
    float worldX = (screenX / ((float) (Gdx.graphics.getWidth()))) * (Core.INSTANCE.camera.orthoCam.viewportWidth);
    worldX *= Core.INSTANCE.camera.orthoCam.zoom;
    float worldY = (((Gdx.graphics.getHeight()) - screenY) / ((float) (Gdx.graphics.getHeight()))) * (Core.INSTANCE.camera.orthoCam.viewportHeight);
    worldY *= Core.INSTANCE.camera.orthoCam.zoom;
    return new com.badlogic.gdx.math.Vector2(worldX, worldY);
}