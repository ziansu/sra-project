public io.getcoffee.motionprofiles.Tuple<java.lang.Double, java.lang.Double> calcMaxAccelFromCurvatureAndDerivative(double curvature, double dCurvature) {
    double divisor = 1 + ((plantWidth) * (java.lang.Math.abs(curvature)));
    double maxVel = (io.getcoffee.motionprofiles.MotionTrajectory.robotMaxVel) / divisor;
    return new io.getcoffee.motionprofiles.Tuple<java.lang.Double, java.lang.Double>(maxVel, (((io.getcoffee.motionprofiles.MotionTrajectory.robotMaxAccel) - (((plantWidth) * maxVel) * dCurvature)) / divisor));
}