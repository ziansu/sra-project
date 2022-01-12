public void teleopPeriodic() {
    int[] commandValue;
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putString("Is this working", "Yep");
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Left Encoder", leftFrontDrive.getEncPosition());
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Right Encoder", rightFrontDrive.getEncPosition());
    try {
        commandValue = myControlBoard.getCommands();
        theMCP.buttonPressed(commandValue);
        myNavigation.navxValues();
        myNavigation.ultrasonicSensor();
    } catch (java.lang.Exception e) {
        org.usfirst.frc.team238.core.Logger.logString("telopperiodic: ");
        e.printStackTrace();
    }
}