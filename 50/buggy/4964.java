public static synchronized void matchHostsToComputeElements(com.emc.storageos.db.client.DbClient _dbClient, java.util.Collection<java.net.URI> hostIds) {
    com.emc.storageos.computesystemcontroller.impl.HostToComputeElementMatcher.matchHosts(_dbClient, hostIds);
}