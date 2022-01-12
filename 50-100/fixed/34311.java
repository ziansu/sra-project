public void robotInit() {
    org.usfirst.frc.team3316.robot.Robot.logger = new org.usfirst.frc.team3316.robot.logger.DBugLogger();
    org.usfirst.frc.team3316.robot.Robot.config = new org.usfirst.frc.team3316.robot.config.Config();
    org.usfirst.frc.team3316.robot.Robot.actuators = new org.usfirst.frc.team3316.robot.robotIO.Actuators();
    org.usfirst.frc.team3316.robot.Robot.sensors = new org.usfirst.frc.team3316.robot.robotIO.Sensors();
    org.usfirst.frc.team3316.robot.Robot.joysticks = new org.usfirst.frc.team3316.robot.humanIO.Joysticks();
    org.usfirst.frc.team3316.robot.Robot.chassis = new org.usfirst.frc.team3316.robot.subsystems.Chassis();
    org.usfirst.frc.team3316.robot.Robot.sdb = new org.usfirst.frc.team3316.robot.humanIO.SDB();
}