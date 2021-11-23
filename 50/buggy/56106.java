public void runOpMode() throws java.lang.InterruptedException {
    super.runOpMode();
    waitForStart();
    moveAlongWallToBeacon(0.3, 1.0, 2.0, 18, true);
}