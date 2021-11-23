public void register(com.qualcomm.robotcore.eventloop.opmode.OpModeManager manager) {
    manager.register("MainTeleOp", com.qualcomm.ftcrobotcontroller.opmodes.MainTeleOp.class);
    manager.register("Blue Alliance Blue Mountain", com.qualcomm.ftcrobotcontroller.opmodes.BlueSideBlue.class);
    manager.register("Blue Alliance Red Mountain", com.qualcomm.ftcrobotcontroller.opmodes.BlueSideRed.class);
    manager.register("Red Alliance Red Mountain", com.qualcomm.ftcrobotcontroller.opmodes.RedSideBlue.class);
    manager.register("Blue Floor Zone and then Mountain", com.qualcomm.ftcrobotcontroller.opmodes.BlueFloorZoneBlue.class);
    manager.register("Floor Goal", com.qualcomm.ftcrobotcontroller.opmodes.FloorZone.class);
    manager.register("Reset Prop Encoder", com.qualcomm.ftcrobotcontroller.opmodes.resetProp.class);
}