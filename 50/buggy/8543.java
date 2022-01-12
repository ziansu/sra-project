public static void getRestoreStatus(java.lang.String id, models.datatable.BackupDataTable.Type type) {
    com.emc.vipr.model.sys.backup.BackupRestoreStatus status = util.BackupUtils.getRestoreStatus(id, (type == (models.datatable.BackupDataTable.Type.LOCAL)));
    controllers.Backup.log.info("lbygg status={}", status);
    renderJSON(new controllers.Backup.RestoreStatus(status));
}