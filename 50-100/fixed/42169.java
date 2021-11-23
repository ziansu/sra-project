private static com.badlogic.gdx.math.Vector2 worldToScreen(float worldX, float worldY) {
    float screenX = (worldX / ((float) ((Core.INSTANCE.camera.orthoCam.viewportWidth) * (Core.INSTANCE.camera.orthoCam.zoom)))) * (Gdx.graphics.getWidth());
    float screenY = (((-worldY) / ((float) ((Core.INSTANCE.camera.orthoCam.viewportHeight) * (Core.INSTANCE.camera.orthoCam.zoom)))) * (Gdx.graphics.getHeight())) + (Gdx.graphics.getHeight());
    return new com.badlogic.gdx.math.Vector2(screenX, screenY);
}