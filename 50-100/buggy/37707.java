@java.lang.Override
public void runOpMode() throws java.lang.InterruptedException {
    bot.init(hardwareMap, telemetry);
    waitForStart();
    while (opModeIsActive()) {
        manageChassis();
        manageClaw();
        manageTelescopicArm();
        manageRelicArm();
        idle();
    } 
}