public void robotInit(org.usfirst.frc.team5985.robot.DriverStation driverStation) {
    camera1 = edu.wpi.first.wpilibj.CameraServer.getInstance();
    driverStation.driverInit(camera1);
    robotDrive = new org.usfirst.frc.team5985.robot.DriveTrain(PWM_LEFT_MOTOR_CONTROLLER_PORT, PWM_RIGHT_MOTOR_CONTROLLER_PORT);
    _intake = new org.usfirst.frc.team5985.robot.Intake(PWM_INTAKE_MOTOR_CONTROLLER_PORT, DIO_INTAKE_SWITCH_PORT);
    _arm = new org.usfirst.frc.team5985.robot.Arm(PWM_ARM_MOTOR_CONTROLLER_PORT);
}