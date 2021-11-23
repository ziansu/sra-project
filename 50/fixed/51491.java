public void changeLinearVelocity(final com.badlogic.gdx.math.Vector2 newVelocity) {
    body.applyLinearImpulse(new com.badlogic.gdx.math.Vector2(newVelocity).sub(body.getLinearVelocity()).scl(body.getMass()), body.getPosition(), true);
}