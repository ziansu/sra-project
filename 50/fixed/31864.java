public float calculateEngineBrakeDeceleration() {
    float gearacceleration = this.getGearAcceleration();
    return gearacceleration / 4;
}