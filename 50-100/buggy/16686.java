public ch.cern.db.flume.source.deserializer.RecoveryManagerLogFile.BackDestination getBackupDestination() {
    java.lang.String backupType = getBackupType();
    if (backupType.contains("newdisk"))
        return ch.cern.db.flume.source.deserializer.RecoveryManagerLogFile.BackDestination.DISK;
    
    if (backupType.contains("BACKUPSET"))
        return ch.cern.db.flume.source.deserializer.RecoveryManagerLogFile.BackDestination.TAPE;
    
    if (backupType.contains("SNAP"))
        return ch.cern.db.flume.source.deserializer.RecoveryManagerLogFile.BackDestination.SNAPSHOT;
    
    return null;
}