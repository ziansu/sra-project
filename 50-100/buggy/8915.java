public void robotInit() {
    leftStick = new org.usfirst.frc.team3501.robot.Joystick(LEFT_JOYSTICK_PORT);
    rightStick = new org.usfirst.frc.team3501.robot.Joystick(RIGHT_JOYSTICK_PORT);
    drivetrain = new org.usfirst.frc.team3501.robot.Drivetrain();
    arm = new org.usfirst.frc.team3501.robot.Arm();
    claw = new org.usfirst.frc.team3501.robot.Claw();
    auton = new org.usfirst.frc.team3501.robot.Auton(arm, claw, drivetrain, timer);
    timer = new edu.wpi.first.wpilibj.Timer();
}