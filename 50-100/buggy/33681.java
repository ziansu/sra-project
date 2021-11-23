protected void initialize() {
    timer.reset();
    timer.start();
    org.usfirst.frc.team3130.robot.subsystems.Chassis.Shift(false);
    double initThrottle = -(OI.stickL.getY());
    double startThrottle = initThrottle / 2.0;
    boolean throttleNeg = startThrottle < 0;
    double throttleConst = (-0.1) / (java.lang.Math.log((startThrottle / 2.0)));
}