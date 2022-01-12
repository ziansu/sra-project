public boolean handlePelvisTrajectoryCommand(us.ihmc.humanoidRobotics.communication.controllerAPI.command.PelvisTrajectoryCommand command) {
    tempPelvisOrientationTrajectoryCommand.set(command);
    return handlePelvisOrientationTrajectoryCommands(tempPelvisOrientationTrajectoryCommand);
}