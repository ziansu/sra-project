public void applyAcceleration() {
    double timeChanged = 20;
    this.currentSpeed += (train.getAcceleration()) * (1000 / timeChanged);
}