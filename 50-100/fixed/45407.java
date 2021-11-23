private void interpolatePosition(final float alpha, final com.badlogic.gdx.physics.box2d.Body body) {
    newPosition.x = (body.getPosition().x) + (((body.getPosition().x) - (previousPosition.x)) * alpha);
    newPosition.y = (body.getPosition().y) + (((body.getPosition().y) - (previousPosition.y)) * alpha);
}