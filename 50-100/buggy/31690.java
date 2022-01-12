protected boolean stepTowards(com.badlogic.gdx.math.Vector2 v, float speed) {
    com.badlogic.gdx.math.Vector2 delta = v.cpy().sub(getPosition().cpy());
    delta.clamp(0, speed);
    setPosition(getPosition().add(delta));
    com.dreamteam.villageTycoon.utils.Debug.print(this, ((("stepped towards " + v) + ", new position = ") + (getPosition())));
    return (delta.len()) < 0.01F;
}