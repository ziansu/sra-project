@java.lang.Override
public void run() {
    while (org.usfirst.frc.team4342.api.drive.TankDrive.run) {
        try {
            if ((edu.wpi.first.wpilibj.DriverStation.getInstance().isEnabled()) && (edu.wpi.first.wpilibj.DriverStation.getInstance().isOperatorControl())) {
                drive.drive(shiftButton);
            }
            java.lang.Thread.sleep(50);
        } catch (java.lang.Exception ex) {
            Repository.Logs.error((("Unexpected error in DriveTrain (" + (org.usfirst.frc.team4342.api.logging.ExceptionInfo.getType(ex))) + ")"), ex);
        }
    } 
}