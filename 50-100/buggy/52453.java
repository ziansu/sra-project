public synchronized com.emc.storageos.cimadapter.connections.cim.CimConnection getConnection(java.lang.String ipAddress, java.lang.String port) {
    com.emc.storageos.cimadapter.connections.cim.CimConnection connection = null;
    try {
        connection = _connectionManager.getConnection(com.emc.storageos.cimadapter.connections.ConnectionManager.generateConnectionCacheKey(ipAddress, java.lang.Integer.parseInt(port)));
        if (null == connection) {
            connection = addConnection(ipAddress, port);
        }
    } catch (final com.emc.storageos.cimadapter.connections.ConnectionManagerException ex) {
        com.emc.storageos.volumecontroller.impl.smis.CIMConnectionFactory._log.error("Problem establishing connection to the SMI-S Provider: {} due to ", ipAddress, ex);
        throw new java.lang.IllegalStateException(("Problem establishing connection to the SMI-S Provider: " + ipAddress), ex);
    }
    return connection;
}