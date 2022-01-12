public void init_loop() {
    if (lim.isPressed()) {
        telearm.setPower(0);
        telearm.setMode(DcMotorController.RunMode.RESET_ENCODERS);
        telearm.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
        extend.setMode(DcMotorController.RunMode.RESET_ENCODERS);
        extend.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
    }else {
        telearm.setPower((-0.1));
    }
}