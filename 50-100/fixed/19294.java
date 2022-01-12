@java.lang.Override
public void robotInit() {
    org.usfirst.frc.team948.robot.Robot.clock.start();
    edu.wpi.cscore.UsbCamera camera = edu.wpi.first.wpilibj.CameraServer.getInstance().startAutomaticCapture();
    camera.setExposureManual((-11));
    org.usfirst.frc.team948.robot.Robot.proccesor = new org.usfirst.frc.team948.robot.visionProc().start();
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Time", org.usfirst.frc.team948.robot.Robot.clock.get());
}