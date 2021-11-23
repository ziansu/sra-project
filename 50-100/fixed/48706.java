public void newCallInstruction() {
    robot.RoboticArm r = activeRobot;
    programming.Program p = r.getActiveProg();
    programming.CallInstruction call = new programming.CallInstruction(activeRobot);
    if ((activeRobot.getActiveInstIdx()) != (p.getNumOfInst())) {
        r.replaceInstAt(activeRobot.getActiveInstIdx(), call);
    }else {
        p.addInstAtEnd(call);
    }
}