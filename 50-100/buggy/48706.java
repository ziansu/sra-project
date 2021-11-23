public void newCallInstruction() {
    robot.RoboticArm r = robot.RobotRun.getActiveRobot();
    programming.Program p = r.getActiveProg();
    programming.CallInstruction call = new programming.CallInstruction(activeRobot);
    if ((robot.RobotRun.getActiveRobot().getActiveInstIdx()) != (p.getNumOfInst())) {
        r.replaceInstAt(robot.RobotRun.getActiveRobot().getActiveInstIdx(), call);
    }else {
        p.addInstAtEnd(call);
    }
}