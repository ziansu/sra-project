public int calcDrive(double dist) {
    CIRCUMFERENCE = (WHEEL_DIAMETER) * (java.lang.Math.PI);
    ROTATIONS = dist / (CIRCUMFERENCE);
    counts = ((int) (((MOTOR_CPR) * (ROTATIONS)) * (GEAR_RATIO)));
    return counts;
}