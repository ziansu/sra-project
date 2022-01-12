public void robotInit() {
    org.usfirst.frc.team2706.robot.Robot.oi = new org.usfirst.frc.team2706.robot.OI();
    org.usfirst.frc.team2706.robot.Robot.driveTrain = new org.usfirst.frc.team2706.robot.subsystems.DriveTrain();
    org.usfirst.frc.team2706.robot.Robot.camera = new org.usfirst.frc.team2706.robot.subsystems.Camera(org.usfirst.frc.team2706.robot.subsystems.Camera.CAMERA_IP);
    org.usfirst.frc.team2706.robot.Robot.hardwareChooser = new org.usfirst.frc.team2706.robot.subsystems.AutonomousSelector(new org.usfirst.frc.team2706.robot.commands.teleop.ArcadeDriveWithJoystick(), new org.usfirst.frc.team2706.robot.commands.teleop.ArcadeDriveWithJoystick(), new org.usfirst.frc.team2706.robot.commands.autonomous.automodes.ExampleAutoMode());
    teleopControl = new org.usfirst.frc.team2706.robot.commands.teleop.TeleopPneumaticControl();
    edu.wpi.first.wpilibj.CameraServer server = edu.wpi.first.wpilibj.CameraServer.getInstance();
    server.startAutomaticCapture(0);
    cameraCommand = new org.usfirst.frc.team2706.robot.commands.camera.AutomaticCameraControl();
}