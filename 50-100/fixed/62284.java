public void register(com.qualcomm.robotcore.eventloop.opmode.OpModeManager manager) {
    manager.register("NullOp", com.qualcomm.ftcrobotcontroller.opmodes.NullOp.class);
    manager.register("MatrixK9TeleOp", com.qualcomm.ftcrobotcontroller.opmodes.MatrixK9TeleOp.class);
    manager.register("K9TeleOp", com.qualcomm.ftcrobotcontroller.opmodes.K9TeleOp.class);
    manager.register("PushBotAuto", com.qualcomm.ftcrobotcontroller.opmodes.PushBotAuto.class);
    manager.register("PushBotManual", com.qualcomm.ftcrobotcontroller.opmodes.PushBotManual.class);
    manager.register("CF_TracksManual", com.qualcomm.ftcrobotcontroller.opmodes.CF_TracksManual.class);
    manager.register("CF_AutoBlueMtn", com.qualcomm.ftcrobotcontroller.opmodes.CF_AutoBlueMtn.class);
}