private void interpolatePosition(final float alpha, final com.badlogic.gdx.physics.box2d.Body body) {
    newPosition.x = ((body.getPosition().x) * alpha) + ((previousPosition.x) * (1.0F - alpha));
    newPosition.y = ((body.getPosition().y) * alpha) + ((previousPosition.y) * (1.0F - alpha));
}