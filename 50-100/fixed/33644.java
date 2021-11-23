public void teleOp(double chassisX, double chassisY, double liftX, double liftY) {
    boolean canDriveChassis = true;
    boolean canDriveLift = true;
    if (canDriveChassis) {
        arcadeDriveChassis(chassisY, chassisX, CHASSIS_SQUARED_INPUTS);
    }
    if (canDriveLift) {
        arcadeDriveLift(liftY, 0.0, LIFT_SQUARED_INPUTS);
    }
}