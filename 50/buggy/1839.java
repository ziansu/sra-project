protected void execute() {
    Robot.drivetrain.arcadeDrive((0.5 * (Robot.oi.gamepad.getAxis(F310.RY))), (0.5 * (Robot.oi.gamepad.getAxis(F310.LX))));
}