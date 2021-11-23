@java.lang.Override
public void suppress() {
    resetValues();
    robot.getPilot().stop();
    suppressed = true;
}