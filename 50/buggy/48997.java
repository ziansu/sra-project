@java.lang.Override
public void runOpMode() {
    initialization();
    waitForStart();
    alignAndActuateBeacon();
    try {
        java.lang.Thread.sleep(500);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    actuateBlue();
}