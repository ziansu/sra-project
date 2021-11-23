protected void execute() {
    Robot.drivetrain.DRIVE.setMaxOutput((1 - ((1 + (Robot.oi.getJoystick().getRawAxis(3))) / 2)));
}