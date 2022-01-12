public void printError(java.lang.String errorMessage, org.usfirst.frc.team339.Utils.ErrorMessage.PrintsTo PrintsTo) {
    rioTime = getDate();
    matchTime = Hardware.driverStation.getMatchTime();
    if ((PrintsTo == (org.usfirst.frc.team339.Utils.ErrorMessage.PrintsTo.driverStation)) || (PrintsTo == (org.usfirst.frc.team339.Utils.ErrorMessage.PrintsTo.driverStationAndRoboRIO))) {
        final java.lang.String dsReport = appendErrorMessage(errorMessage);
        edu.wpi.first.wpilibj.DriverStation.reportError(dsReport, false);
    }
    if ((PrintsTo == (org.usfirst.frc.team339.Utils.ErrorMessage.PrintsTo.roboRIO)) || (PrintsTo == (org.usfirst.frc.team339.Utils.ErrorMessage.PrintsTo.driverStationAndRoboRIO)))
        PrintsToRIO(errorMessage);
    
}