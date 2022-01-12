public void setSpeed(double leftSpeed, double rightSpeed) {
    this.leftGearbox.setSpeed(leftSpeed);
    this.rightGearbox.setSpeed((-rightSpeed));
}