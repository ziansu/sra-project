public static void restore(java.lang.String id, models.datatable.BackupDataTable.Type type) {
    if (type == (models.datatable.BackupDataTable.Type.REMOTE)) {
        util.BackupUtils.pullBackup(id);
    }
    com.emc.vipr.model.sys.backup.BackupRestoreStatus status = util.BackupUtils.getRestoreStatus(id, (type == (models.datatable.BackupDataTable.Type.LOCAL)));
    renderArgs.put("status", status);
    renderArgs.put("id", id);
    renderArgs.put("type", type);
    render();
}