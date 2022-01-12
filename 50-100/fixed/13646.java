public int calcDrive(double dist) {
    CIRCUMFERENCE = (WHEEL_DIAMETER) * (java.lang.Math.PI);
    ROTATIONS = dist / (CIRCUMFERENCE);
    counts = ((int) (((ROTATIONS) * (GEAR_RATIO)) * (MOTOR_CPR)));
    return counts;
}