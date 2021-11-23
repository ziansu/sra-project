@java.lang.Override
public void update() {
    RobotMap.gearLiftFinder.computeHeadingToTarget();
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Degree Offset (X)", RobotMap.gearLiftFinder.getHeadingToTargetDegrees());
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putBoolean("We can see the target", RobotMap.gearLiftFinder.haveValidHeading());
    if (((RobotMap.gearLiftFinder.getHeadingToTargetDegrees()) > 2) || ((RobotMap.gearLiftFinder.getHeadingToTargetDegrees()) < (-2))) {
        org.usfirst.frc.team95.robot.auto.RotateBy rb = new org.usfirst.frc.team95.robot.auto.RotateBy(RobotMap.gearLiftFinder.getHeadingToTargetRadians(), compass);
    }else {
        stop();
    }
}