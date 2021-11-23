public orwell.messages.Robot.ServerRobotState getAndClearServerRobotState() {
    if ((serverRobotStateBuilder.getRfidList().isEmpty()) && (serverRobotStateBuilder.getColourList().isEmpty())) {
        return null;
    }
    orwell.messages.Robot.ServerRobotState srs = serverRobotStateBuilder.build();
    clearServerRobotState();
    return srs;
}