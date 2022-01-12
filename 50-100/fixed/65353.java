public void register(com.qualcomm.robotcore.eventloop.opmode.OpModeManager manager) {
    manager.register("NullOp", com.qualcomm.ftcrobotcontroller.opmodes.NullOp.class);
    manager.register("K9TeleOp", com.qualcomm.ftcrobotcontroller.opmodes.K9TeleOp.class);
    manager.register("K9Line", com.qualcomm.ftcrobotcontroller.opmodes.K9Line.class);
    manager.register("PushBotAuto", com.qualcomm.ftcrobotcontroller.opmodes.PushBotAuto.class);
    manager.register("PushBotManual", com.qualcomm.ftcrobotcontroller.opmodes.PushBotManual.class);
}