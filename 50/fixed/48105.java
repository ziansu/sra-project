public com.badlogic.gdx.math.collision.Ray getPickRay(float screenX, float screenY) {
    return camera.getPickRay(screenX, screenY, this.screenX, this.screenY, screenWidth, screenHeight);
}