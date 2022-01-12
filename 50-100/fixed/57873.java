@org.junit.BeforeClass
public static void setUp() {
    java.util.Map<java.lang.String, java.lang.String> hosts = new java.util.TreeMap<>();
    hosts.put(com.emc.storageos.management.backup.BackupOpsTest.STANDALONE, com.emc.storageos.management.backup.BackupOpsTest.LOCALHOST);
    com.emc.storageos.management.backup.BackupOpsTest.backupOps.setHosts(hosts);
    com.emc.storageos.management.backup.BackupOpsTest.backupOps.setPorts(java.util.Arrays.asList(7199));
    com.emc.storageos.management.backup.BackupOpsTest.backupOps.setCoordinatorClient(coordinatorClient);
    com.emc.storageos.coordinator.client.model.ProductName name = new com.emc.storageos.management.backup.BackupOpsTest.DummyProductName("vipr");
}