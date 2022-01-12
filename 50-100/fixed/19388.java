private static void init(java.lang.String[] args) {
    com.emc.storageos.management.backup.BackupCmd.initCommandLine(args);
    com.emc.storageos.management.backup.BackupCmd.initRestoreManager();
    if ((!(com.emc.storageos.management.backup.BackupCmd.cli.hasOption(com.emc.storageos.management.backup.BackupCmd.CommandType.restore.name()))) && (!(com.emc.storageos.management.backup.BackupCmd.cli.hasOption(com.emc.storageos.management.backup.BackupCmd.CommandType.purge.name())))) {
        com.emc.storageos.management.backup.BackupCmd.initBackupOps();
    }
}