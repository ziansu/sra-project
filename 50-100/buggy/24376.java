public void toggleEEState(robot.RoboticArm robot) {
    int edx = (robot.getActiveEEIdx()) - 1;
    int curState = robot.getEEState();
    if (curState == (global.Fields.ON)) {
        robot.setEEState(edx, Fields.OFF);
    }else {
        robot.setEEState(edx, Fields.ON);
    }
    robot.checkPickupCollision(activeScenario);
}