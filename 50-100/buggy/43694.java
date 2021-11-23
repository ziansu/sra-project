public void register(com.qualcomm.robotcore.eventloop.opmode.OpModeManager manager) {
    com.google.blocks.ftcrobotcontroller.runtime.BlocksOpMode.registerAll(manager);
    manager.register("NullOp", org.firstinspires.ftc.robotcontroller.internal.NullOp.class);
    manager.register("Michael Jackson Moves", org.firstinspires.ftc.robotcontroller.external.samples.PushbotAutoDriveByTime_Linear.class);
    manager.register("TeleOp Bot Config", org.firstinspires.ftc.robotcontroller.external.samples.PushbotTeleopPOV_Linear.class);
    manager.register("TeleOp Tank Drive", org.firstinspires.ftc.robotcontroller.external.samples.PushbotTeleopTank_Iterative.class);
    com.qualcomm.robotcore.eventloop.opmode.AnnotatedOpModeRegistrar.register(manager);
}