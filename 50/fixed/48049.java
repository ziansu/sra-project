protected void execute() {
    if (Robot.cameraSystem.processData()) {
        double headingToTarget = Robot.navController.getHeading();
        Robot.positionEstimator.updatePositionFromVision(Robot.cameraSystem.realDist, headingToTarget);
    }
}