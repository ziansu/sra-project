public void moveDriveTrain_Speed(double frontLSpeed, double frontRSpeed, double rearLSpeed, double readRSpeed) {
    talons.get(0).set(frontLSpeed);
    talons.get(1).set(frontRSpeed);
    talons.get(2).set(rearLSpeed);
    talons.get(3).set(readRSpeed);
}