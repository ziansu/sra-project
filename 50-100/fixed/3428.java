public void setHandLinearControlAndYawPitchOnly(us.ihmc.robotics.robotSide.RobotSide robotSide) {
    double[] controlledPositionAxes = new double[]{ 1.0 , 1.0 , 1.0 };
    double[] controlledOrientationAxes = new double[]{ 0.0 , 1.0 , 1.0 };
    setHandControlledAxes(robotSide, controlledPositionAxes, controlledOrientationAxes);
}