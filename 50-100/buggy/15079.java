public void updateSpewInfo() {
    int numSpatial = ((visionSubsystem.getBoulderInfo()) == null) ? 0 : visionSubsystem.getBoulderInfo().length;
    competition.subsystems.vision.commands.SpewVisionInformationCommand.log.debug(((((("Currently has " + numSpatial) + " spatial coords") + " (connection is ") + (visionSubsystem.isConnectionHealthy() ? "healthy" : "unhealthy")) + ")"));
    this.lastSpewTimestamp = edu.wpi.first.wpilibj.Timer.getFPGATimestamp();
}