@java.lang.Override
public void robotInit() {
    this.logger = new org.usfirst.frc.team4141.MDRobotBase.Logger(this);
    this.subsystems = new java.util.Hashtable<java.lang.String, org.usfirst.frc.team4141.MDRobotBase.MDSubsystem>();
    this.commandChooser = new java.util.Hashtable<java.lang.String, org.usfirst.frc.team4141.MDRobotBase.MDCommand>();
    oi = new org.usfirst.frc.team4141.robot.OI(this);
    configureRobot();
    oi.configureOI();
    java.lang.System.out.println("RobotInit completed");
}