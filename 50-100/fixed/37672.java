@java.lang.Override
public void collectStatisticsInformation(com.emc.storageos.plugins.AccessProfile accessProfile) throws com.emc.storageos.plugins.BaseCollectionException {
    try {
        com.emc.storageos.volumecontroller.impl.plugins.VNXFileCommunicationInterface._logger.info("Start collecting statistics for ip address {}", accessProfile.getIpAddress());
        populateMap(accessProfile);
        computeVNXStaticLoadMetrics(accessProfile);
        executor.execute(((com.emc.storageos.plugins.common.domainmodel.Namespace) (namespaces.getNsList().get(com.emc.storageos.volumecontroller.impl.plugins.VNXFileCommunicationInterface.METERINGFILE))));
        dumpStatRecords();
        injectStats();
        com.emc.storageos.volumecontroller.impl.plugins.VNXFileCommunicationInterface._logger.info("End collecting statistics for ip address {}", accessProfile.getIpAddress());
    } finally {
        releaseResources();
    }
}