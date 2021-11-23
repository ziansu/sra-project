public void move(float time) {
    position.add(com.github.infosimulators.physic.Vector2.scale(acceleration, ((0.5F * time) * time)).add(velocity));
    velocity.add(acceleration.scale(time));
}