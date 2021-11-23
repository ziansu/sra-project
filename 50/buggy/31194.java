@java.lang.Override
protected void execute() {
    Robot.rightFlywheel.spin(edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.getNumber("FlywheelParam"));
}