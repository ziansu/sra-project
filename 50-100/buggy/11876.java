public void register(com.qualcomm.robotcore.eventloop.opmode.OpModeManager manager) {
    manager.register("NullOp", com.qualcomm.ftcrobotcontroller.opmodes.NullOp.class);
    manager.register("MatrixK9TeleOp", com.qualcomm.ftcrobotcontroller.opmodes.MatrixK9TeleOp.class);
    manager.register("K9TeleOp", com.qualcomm.ftcrobotcontroller.opmodes.Gyro_One.class);
    manager.register("PushBotAuto", com.qualcomm.ftcrobotcontroller.opmodes.PushBotAuto.class);
    manager.register("Beacon", com.qualcomm.ftcrobotcontroller.opmodes.Autonomous.class);
    manager.register("Tankie", com.qualcomm.ftcrobotcontroller.opmodes.TankDrive.class);
    manager.register("Auto ", com.qualcomm.ftcrobotcontroller.opmodes.Autonomous.class);
    manager.register("All Test", com.qualcomm.ftcrobotcontroller.opmodes.AllTest.class);
}