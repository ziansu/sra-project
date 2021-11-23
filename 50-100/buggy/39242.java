public void robotInit() {
    org.usfirst.frc.team2785.robot.Robot.oi = new org.usfirst.frc.team2785.robot.OI();
    org.usfirst.frc.team2785.robot.Robot.drivebase = new org.usfirst.frc.team2785.robot.DriveBase();
    org.usfirst.frc.team2785.robot.Robot.cameramount = new org.usfirst.frc.team2785.robot.CameraMount(RobotMap.cameraHorizontal, RobotMap.cameraVertical, RobotMap.camera);
    org.usfirst.frc.team2785.robot.Robot.marvinarm = new org.usfirst.frc.team2785.robot.MarvinArm();
    chooser = new edu.wpi.first.wpilibj.smartdashboard.SendableChooser();
    chooser.addDefault("drive forward", new org.usfirst.frc.team2785.robot.commands.DriveDistance(36, 36, 0.5, 0.5, RobotMap.wheelDiameter));
    chooser.addObject("do a 180", new org.usfirst.frc.team2785.robot.commands.Turn(180, 0.5));
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putData("Auto mode", chooser);
}