public void operatorControl() {
    drive.shiftToHighGearMotion();
    while (isEnabled()) {
        drive.driving(getLeftY(), getLeftX(), getRightX(), getShiftButton(), getRightBumper(), getButtonA(), getButtonB(), getButtonX(), getButtonY());
    } 
}