public void robotInit() {
    org.usfirst.frc.team360.robot.Robot.drivetrain = new org.usfirst.frc.team360.robot.subsystems.DriveTrain();
    org.usfirst.frc.team360.robot.Robot.lift = new org.usfirst.frc.team360.robot.subsystems.Lift();
    org.usfirst.frc.team360.robot.Robot.tains = new org.usfirst.frc.team360.robot.subsystems.Tains();
    org.usfirst.frc.team360.robot.Robot.pneumatics = new org.usfirst.frc.team360.robot.subsystems.Pneumatics();
    org.usfirst.frc.team360.robot.Robot.centerers = new org.usfirst.frc.team360.robot.subsystems.Centerers();
    org.usfirst.frc.team360.robot.Robot.velocitypid = new org.usfirst.frc.team360.robot.subsystems.velocityPID();
    org.usfirst.frc.team360.robot.Robot.motionprofiles = new org.usfirst.frc.team360.robot.MotionProfiles();
    org.usfirst.frc.team360.robot.Robot.oi = new org.usfirst.frc.team360.robot.OI();
}