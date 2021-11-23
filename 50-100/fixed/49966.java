public void safeDrive(double throttle) {
    throttle = org.usfirst.frc.team4536.robot.Utilities.limit(throttle, (-1.0), Constants.HOLD_SCISSOR_SPEED);
    double tempVar = throttle;
    throttle = org.usfirst.frc.team4536.robot.Utilities.accelLimit(throttle, oldThrottle, Constants.ACCEL_LIMIT_DRIVE);
    driveLift(throttle);
    oldThrottle = tempVar;
}