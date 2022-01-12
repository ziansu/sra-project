protected boolean stepTowards(com.badlogic.gdx.math.Vector2 v, float speed) {
    com.badlogic.gdx.math.Vector2 delta = v.cpy().sub(getPosition().cpy());
    delta.clamp(0, speed);
    setPosition(getPosition().add(delta));
    return (delta.len()) < 0.01F;
}