@java.lang.Override
public void runOpMode() throws java.lang.InterruptedException {
    Ready4Action();
    waitForStart();
    while (opModeIsActive()) {
        if (gamepad1.x) {
            Sethe.setPosition(1);
        }else {
            Sethe.setPosition((((gamepad1.left_stick_y) + 1) / 2));
        }
        waitForNextHardwareCycle();
    } 
}