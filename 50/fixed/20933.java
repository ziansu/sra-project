@com.netflix.priam.backup.Test
public void testSnapshotBackup() throws java.lang.Exception {
    com.netflix.priam.backup.TestBackup.filesystem.setupTest();
    com.netflix.priam.backup.SnapshotBackup backup = com.netflix.priam.backup.TestBackup.injector.getInstance(com.netflix.priam.backup.SnapshotBackup.class);
}