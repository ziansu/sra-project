public void createLog(engine.BackupEngine backupEngine) {
    dataDestination = backupEngine.destination;
    errors = backupEngine.errorCounter;
    totalBackupSize = backupEngine.totalBackupSize;
    percentError = backupEngine.percentError;
    hoursItTook = backupEngine.hoursItTook;
    minutesRemaining = backupEngine.minutesRemaining;
}