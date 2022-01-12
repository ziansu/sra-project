public void step(com.icarus.project.Airplane airplane, float dt) {
    super.step(airplane, dt);
    velocity.add(velocity.cpy().nor().scl((dt * (accelRate))));
    if ((com.icarus.project.PIScreen.toMeters(velocity.len())) > 150) {
        airplane.transitionToFlying(0);
        airplane.setTargetAltitude(10000);
    }
}