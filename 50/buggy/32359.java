public boolean shouldForwardAssist() {
    return (java.lang.Math.abs(gamepad.getAxis(GamepadAxis.LeftX))) < (java.lang.Math.abs(org.usfirst.frc.team1076.robot.commands.TeleopWithGyroCommand.FORWARD_ASSIST_MAX_TURN_SPEED));
}