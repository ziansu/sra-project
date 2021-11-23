public boolean handlePelvisOrientationTrajectoryCommands(us.ihmc.humanoidRobotics.communication.controllerAPI.command.PelvisOrientationTrajectoryCommand command, us.ihmc.robotics.geometry.FrameOrientation initialOrientation) {
    tempPose.setToNaN(initialOrientation.getReferenceFrame());
    tempPose.setOrientation(initialOrientation);
    return taskspaceControlState.handleOrientationTrajectoryCommand(command, tempPose);
}