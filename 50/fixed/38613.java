protected float checkTheLaserCoordinatesX(java.util.ArrayList<com.vratsasoftware.spaceinvaders.components.Laser> lasersShot, com.badlogic.gdx.graphics.g2d.SpriteBatch batch, int x) {
    if ((lasersShot.size()) > 0) {
        return lasersShot.get(x).getLaserX();
    }
    return 0;
}