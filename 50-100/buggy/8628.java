@java.lang.Override
public void robotInit() {
    robotState = org.usfirst.frc.team4529.robot.RobotState.getInstance();
    robotState.start();
    robotArm = org.usfirst.frc.team4529.robot.RobotArm.getInstance();
    robotShooter = org.usfirst.frc.team4529.robot.RobotShooter.getInstance();
    joystick = new edu.wpi.first.wpilibj.Joystick(org.usfirst.frc.team4529.robot.Robot.JOYSTICK_PORT);
    driveBase = new org.usfirst.frc.team4529.robot.drivebase.OmniWheel();
    pausableThreads.add(robotShooter);
    pausableThreads.add(robotArm);
    pausableThreads.add(driveBase);
}