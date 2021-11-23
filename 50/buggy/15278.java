@java.lang.Override
public final void setInitialStanceFoot(us.ihmc.robotics.geometry.FramePose stanceFootPose, us.ihmc.robotics.robotSide.RobotSide initialSide) {
    initialStanceFootWasSet = true;
    stanceFootPose.checkReferenceFrameMatch(us.ihmc.robotics.referenceFrames.ReferenceFrame.getWorldFrame());
    this.initialSide = initialSide;
    stanceFootPose.getPose(initialFootPose);
}