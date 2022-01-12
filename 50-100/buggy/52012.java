private java.io.File getBackupDir(java.lang.String backupName) {
    java.io.File backupDir = new java.io.File((((backupOps.getBackupDir()) + "/") + backupName));
    if (backupDir.exists()) {
        return backupDir;
    }
    backupDir = new java.io.File(("/data/" + backupName));
    if (backupDir.exists()) {
        return backupDir;
    }
    throw APIException.badRequests.invalidParameter("backupname", backupName);
}