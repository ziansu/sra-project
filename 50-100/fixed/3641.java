@java.lang.Override
public void runOpMode() throws java.lang.InterruptedException {
    initialize();
    waitForStart();
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