public void robotInit() {
    driveConsole = new org.usfirst.frc.team5985.robot.DriveConsole();
    driveTrain = new org.usfirst.frc.team5985.subsystems.DriveTrain(driveConsole.getJoystick());
    shooter = new org.usfirst.frc.team5985.subsystems.Shooter(driveConsole.getJoystick());
    climber = new org.usfirst.frc.team5985.subsystems.Climber(driveConsole.getXbox());
    auto = new org.usfirst.frc.team5985.routines.Auto(org.usfirst.frc.team5985.routines.Auto.autoPositions.DEFAULT, driveTrain, shooter);
}