public void bindButtons() {
    org.usfirst.frc.team2265.robot.OI.swap.whenPressed(new org.usfirst.frc.team2265.robot.commands.GearShift());
    org.usfirst.frc.team2265.robot.OI.ultrasonicBtn.whenPressed(new org.usfirst.frc.team2265.robot.commands.UltrasonicDrive());
}