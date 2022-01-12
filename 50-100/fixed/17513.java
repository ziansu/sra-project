@java.lang.Override
protected void initialize() {
    if (((vision.getTimeSinceLastUpdate()) <= (org.usfirst.frc.team1294.robot.commands.TurnTowardsVisionTarget.MAX_AGE_OF_VISION_DATA)) && (vision.isTargetAcquired())) {
        bearing = ((vision.getTargetX()) - ((org.usfirst.frc.team1294.robot.commands.TurnTowardsVisionTarget.WIDTH) / 2)) * (org.usfirst.frc.team1294.robot.commands.TurnTowardsVisionTarget.DEGREES_PER_PIXEL);
    }
    super.initialize();
}