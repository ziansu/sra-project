private void Record() {
    if ((recordTime.time()) >= 0.1) {
        recordTime.reset();
        com.qualcomm.ftcrobotcontroller.Extras.AutoGamepad Gamepad1 = new com.qualcomm.ftcrobotcontroller.Extras.AutoGamepad(gamepad1);
        com.qualcomm.ftcrobotcontroller.Extras.AutoGamepad Gamepad2 = new com.qualcomm.ftcrobotcontroller.Extras.AutoGamepad(gamepad2);
        Recording.add(Gamepad1);
        Recording.add(Gamepad2);
    }
}