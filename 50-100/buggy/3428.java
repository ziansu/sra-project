public void setHandLinearControlAndYawPitchOnly(us.ihmc.robotics.robotSide.RobotSide robotSide) {
    boolean[] controlledPositionAxes = new boolean[]{ true , true , true };
    boolean[] controlledOrientationAxes = new boolean[]{ false , true , true };
    setHandControlledAxes(robotSide, controlledPositionAxes, controlledOrientationAxes);
}