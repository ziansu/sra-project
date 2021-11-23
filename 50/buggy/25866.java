private boolean isSpeedForSureNotRiding(float speedKmh) {
    return speedKmh < (this.maybeRidingSpeed);
}