public orwell.messages.Robot.ServerRobotState getAndClearServerRobotState() {
    if ((serverRobotStateBuilder.getRfidList().isEmpty()) && (serverRobotStateBuilder.getColourList().isEmpty())) {
        orwell.proxy.TankDeltaState.logback.debug("RfidList and ColourList are empty");
        return null;
    }
    orwell.messages.Robot.ServerRobotState srs = serverRobotStateBuilder.build();
    clearServerRobotState();
    return srs;
}