private void updateAcceleration() {
    float newacceleration = this.calculateAcceleration();
    bus.setAcceleration(((int) (newacceleration)));
}