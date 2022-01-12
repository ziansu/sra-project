@java.lang.Override
public void update() {
    position.x -= (speed) * (Gdx.graphics.getDeltaTime());
    if ((position.x) < (-(dimension.x))) {
        position.x = startingPosition.x;
    }
    updateHitBox();
}