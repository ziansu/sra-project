public void robotInit() {
    java.lang.System.out.println("-> Robot");
    org.usfirst.frc.team2531.robot.Robot.oi = new org.usfirst.frc.team2531.robot.OI();
    org.usfirst.frc.team2531.robot.Robot.drive = new org.usfirst.frc.team2531.robot.subsystems.Drive();
    org.usfirst.frc.team2531.robot.Robot.elevator = new org.usfirst.frc.team2531.robot.subsystems.BallElevator();
    org.usfirst.frc.team2531.robot.Robot.intake = new org.usfirst.frc.team2531.robot.subsystems.BallIntake();
    org.usfirst.frc.team2531.robot.Robot.shooter = new org.usfirst.frc.team2531.robot.subsystems.Shooter();
    RobotMap.imu.calibrate();
    RobotMap.imu.startLiveWindowMode();
}