public double calcMaxSpeed(double s) {
    return (org.usfirst.frc4904.robot.RobotMap.maxVel) / (1 + (((plantWidth) * (java.lang.Math.abs(splineGenerator.calcCurvature(s)))) / 2));
}