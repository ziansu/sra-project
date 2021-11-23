public com.badlogic.gdx.math.collision.Ray getPickRay(float screenX, float screenY) {
    return camera.getPickRay(screenX, screenY, screenX, screenY, screenWidth, screenHeight);
}