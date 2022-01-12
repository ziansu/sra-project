public static void testFailover() {
    com.emc.storageos.volumecontroller.impl.isilon.IsilonReplicationTest._isi = new com.emc.storageos.volumecontroller.impl.isilon.IsilonFileStorageDevice();
    com.emc.storageos.isilon.restapi.IsilonApiFactory factory = new com.emc.storageos.isilon.restapi.IsilonApiFactory();
    factory.init();
    com.emc.storageos.volumecontroller.impl.isilon.IsilonReplicationTest._isi.setIsilonApiFactory(factory);
    com.emc.storageos.volumecontroller.impl.isilon.IsilonReplicationTest._device = new com.emc.storageos.db.client.model.StorageSystem();
    com.emc.storageos.volumecontroller.impl.isilon.IsilonReplicationTest._device.setSystemType("isilon");
    com.emc.storageos.volumecontroller.impl.isilon.IsilonReplicationTest._device.setIpAddress("");
    com.emc.storageos.volumecontroller.impl.isilon.IsilonReplicationTest._device.setPortNumber(8080);
    com.emc.storageos.volumecontroller.impl.isilon.IsilonReplicationTest._device.setUsername(com.emc.storageos.volumecontroller.impl.isilon.IsilonReplicationTest.userName);
    com.emc.storageos.volumecontroller.impl.isilon.IsilonReplicationTest._device.setPassword(com.emc.storageos.volumecontroller.impl.isilon.IsilonReplicationTest.password);
    com.emc.storageos.volumecontroller.impl.isilon.IsilonReplicationTest.result = com.emc.storageos.volumecontroller.impl.isilon.IsilonReplicationTest._isi.doFailover(com.emc.storageos.volumecontroller.impl.isilon.IsilonReplicationTest._device, "mudit_policy", null);
    com.emc.storageos.volumecontroller.impl.isilon.IsilonReplicationTest.result.getCommandStatus();
}