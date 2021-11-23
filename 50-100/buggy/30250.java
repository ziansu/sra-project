public void update(double dt) {
    for (int i = 0; i < (this.velocity.length); i++) {
        this.velocity[i] += dt * ((this.force[i]) / (mass));
        this.position[i] += dt * (this.velocity[i]);
    }
}