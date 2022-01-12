@java.lang.Override
public void initialize() {
    competition.subsystems.vision.commands.RotateTowardsBallCommand.log.info("Initializing");
    competition.subsystems.vision.BallSpatialInfo targetBall = visionSubsystem.findTargetBall();
    if (targetBall == null) {
        competition.subsystems.vision.commands.RotateTowardsBallCommand.log.warn("No target ball found! Nothing to track.");
        currentBallHeadingTarget.set(java.lang.Double.POSITIVE_INFINITY);
    }
    currentBallHeadingTarget.set(poseSubsystem.getCurrentHeading().shiftValue(targetBall.relativeHeading).shiftValue((-(cameraCenterHeading.get()))).getValue());
}