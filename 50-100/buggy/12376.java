public void setHandLinearControlOnly(us.ihmc.robotics.robotSide.RobotSide robotSide) {
    boolean[] controlledPositionAxes = new boolean[]{ true , true , true };
    boolean[] controlledOrientationAxes = new boolean[]{ false , false , false };
    setHandControlledAxes(robotSide, controlledPositionAxes, controlledOrientationAxes);
}