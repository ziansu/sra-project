public java.lang.String startBackup(java.lang.String backupType) throws java.lang.Exception {
    try {
        com.cs.entity.Orientdb orient = startOrientDBBackup();
        com.cs.entity.Elasticsearch elasticsearch = startElasticsearchBackup();
        com.cs.entity.Swift swift = startSwiftBackup();
        createBackupSummery(orient, elasticsearch, swift, backupType);
        java.lang.String resposne = createBackupSummery(orient, elasticsearch, swift, backupType);
        return resposne;
    } catch (java.lang.Exception e) {
        com.cs.job.BackupJob.logger.error(e);
        createBackupSummeryforException(e.getMessage(), backupType);
        throw e;
    }
}