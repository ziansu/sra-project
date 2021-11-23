protected void initialize() {
    timer.reset();
    timer.start();
    org.usfirst.frc.team3130.robot.subsystems.Chassis.Shift(false);
    initThrottle = -(OI.stickL.getY());
    startThrottle = (initThrottle) / 2.0;
    throttleNeg = (startThrottle) < 0;
    throttleConst = (-0.1) / (java.lang.Math.log(((startThrottle) / 2.0)));
}