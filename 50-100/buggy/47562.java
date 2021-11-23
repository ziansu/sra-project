@java.lang.Override
protected void setBehaviorInput() {
    us.ihmc.robotics.geometry.FramePose2d targetPose = new us.ihmc.robotics.geometry.FramePose2d(hatchFrame);
    targetPose.setX(targetLocationHatchAfterNear.getX());
    targetPose.setY(targetLocationHatchAfterNear.getY());
    targetPose.setYaw(0.0);
    targetPose.changeFrame(us.ihmc.robotics.referenceFrames.ReferenceFrame.getWorldFrame());
    atlasPrimitiveActions.walkToLocationBehavior.setWalkingStepWidth(defaultStepWidth);
    atlasPrimitiveActions.walkToLocationBehavior.setFootstepLength(0.2);
    atlasPrimitiveActions.walkToLocationBehavior.setTarget(targetPose);
}