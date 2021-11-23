protected void end() {
    org.team3128.common.util.Log.info("CmdMoveDistance", "Ending");
    stopMovement();
    if (isTimedOut()) {
        org.team3128.common.autonomous.AutoUtils.killRobot("Autonomous Move Overtime");
    }
}