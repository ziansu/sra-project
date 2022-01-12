@java.lang.Override
public void draw(com.badlogic.gdx.graphics.g2d.Batch batch, float parentAlpha) {
    handlePlayerOperations();
    batch.draw(getTextureByStatus(), getX(), getY());
    if (isFiring()) {
        batch.draw(playerTextureRegion[4], getX(), getY());
    }
    removeOnDead();
}