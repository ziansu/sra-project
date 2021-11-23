@java.lang.Override
public void runOpMode() throws java.lang.InterruptedException {
    initialize();
    waitForStart();
    core.forward(23, 0.25);
    core.turn((-5.6), 0.1);
    core.forward(40, 0.25);
    try {
        core.alignAndActuateBeaconBlue();
    } catch (java.util.concurrent.TimeoutException e) {
        e.printStackTrace();
        leftDrive.setPower(0.0);
        rightDrive.setPower(0.0);
        this.stop();
    }
    log.close();
}