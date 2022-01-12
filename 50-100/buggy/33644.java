public void teleOp(double chassisX, double chassisY, double liftX, double liftY) {
    boolean canDriveChassis = true;
    boolean canDriveLift = true;
    if (canDriveChassis) {
        arcadeDriveChassis(chassisX, chassisY, CHASSIS_SQUARED_INPUTS);
    }
    if (canDriveLift) {
        arcadeDriveLift(liftX, liftY, LIFT_SQUARED_INPUTS);
    }
}