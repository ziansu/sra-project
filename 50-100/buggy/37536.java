private void updateSpeed() {
    float gearmaxspeed = this.getGearMaxSpeed();
    float currentspeed = bus.getCurrentSISpeed();
    float currentacc = bus.getAcceleration();
    float newspeed = java.lang.Math.max(0, java.lang.Math.min((currentspeed + currentacc), gearmaxspeed));
    if ((bus.getGearPosition()) == (Bus.GearPosition.REVERSE)) {
        newspeed = -newspeed;
    }
    bus.setCurrentSISpeed(newspeed);
}