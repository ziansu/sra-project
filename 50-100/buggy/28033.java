public void printError(java.lang.String errorMessage, org.usfirst.frc.team339.Utils.ErrorMessage.PrintsTo PrintsTo) {
    this.rioTime = this.getDate();
    this.matchTime = Hardware.driverStation.getMatchTime();
    if ((PrintsTo == (org.usfirst.frc.team339.Utils.ErrorMessage.PrintsTo.driverStation)) || (PrintsTo == (org.usfirst.frc.team339.Utils.ErrorMessage.PrintsTo.driverStationAndRoboRIO))) {
        final java.lang.String dsReport = this.appendErrorMessage(errorMessage);
        edu.wpi.first.wpilibj.DriverStation.reportError(dsReport, false);
    }
    if ((PrintsTo == (org.usfirst.frc.team339.Utils.ErrorMessage.PrintsTo.roboRIO)) || (PrintsTo == (org.usfirst.frc.team339.Utils.ErrorMessage.PrintsTo.driverStationAndRoboRIO))) {
        this.PrintsToRIO(errorMessage);
    }
}