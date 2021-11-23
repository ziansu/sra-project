@java.lang.Override
public void runOpMode() throws java.lang.InterruptedException {
    magic.initium(hardwareMap, telemetry);
    waitForStart();
    while (opModeIsActive()) {
        magic.vu_arbitrium(hardwareMap, telemetry);
    } 
}