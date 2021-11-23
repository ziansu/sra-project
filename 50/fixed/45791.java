public void applyForwardImpulse(float power) {
    body.applyForceToCenter(((com.badlogic.gdx.math.MathUtils.cos(body.getAngle())) * power), ((com.badlogic.gdx.math.MathUtils.sin(body.getAngle())) * power), true);
}