@java.lang.Override
public void setSpeedVector(com.github.fishio.Vec2d vector) {
    vx = ((int) (100 * (vector.x)));
    vy = ((int) (100 * (vector.y)));
}