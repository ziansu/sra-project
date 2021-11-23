protected boolean isFinished() {
    return ((Robot.shooter.lowercloop.isDestinationReached()) && (Robot.shooter.uppercloop.isDestinationReached())) || ((!(Robot.shooter.lowercloop.isPIDEnabled())) && (!(Robot.shooter.uppercloop.isPIDEnabled())));
}