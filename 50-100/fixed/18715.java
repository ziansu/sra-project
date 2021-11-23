public void motorGear() {
    if (stick0.getRawButton(1)) {
        motorGear.setSpeed((-0.8));
    }
    if (stick0.getRawButton(2)) {
        motorGear.setSpeed(0.8);
    }
    if ((stick0.getRawButton(1)) == (stick0.getRawButton(2))) {
        motorGear.setSpeed(0.0);
    }
}