public void update(double dt) {
    this.velocity[0] += dt * ((this.force[0]) / (this.mass));
    this.velocity[1] += dt * ((this.force[1]) / (this.mass));
    this.position[0] += dt * (this.velocity[0]);
    this.position[1] += dt * (this.velocity[1]);
}