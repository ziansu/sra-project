public void update(float delta) {
    velocity.add(acceleration.cpy().scl(delta));
    if ((velocity.y) > 200) {
        velocity.y = 200;
    }
    position.add(velocity.cpy().scl(delta));
}