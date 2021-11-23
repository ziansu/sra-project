protected void execute() {
    if (org.usfirst.frc.team500.robot.OI.aPressed()) {
        org.usfirst.frc.team500.robot.subsystems.DrivetrainSubsystem.getInstance().forwardFullVelocity();
    }else
        if (org.usfirst.frc.team500.robot.OI.bPressed()) {
            org.usfirst.frc.team500.robot.subsystems.DrivetrainSubsystem.getInstance().backwardsFullVelocity();
        }else {
            org.usfirst.frc.team500.robot.subsystems.DrivetrainSubsystem.getInstance().arcadeDrive(org.usfirst.frc.team500.robot.OI.getLeftYValue(), org.usfirst.frc.team500.robot.OI.getLeftXValue(), RobotMap.Cyber.DRIVE_SENSITIVITY);
        }
    
}