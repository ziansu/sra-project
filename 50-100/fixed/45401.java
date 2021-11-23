public void update(float dt) {
    velocity.add(acceleration.cpy().scl(dt));
    if ((velocity.y) < (-200)) {
        velocity.y = -200;
    }
    position.add(velocity.cpy().scl(dt));
}