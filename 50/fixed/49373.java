protected boolean isFinished() {
    return (Robot.driveTrain.getRightDistance()) <= (endDistance);
}