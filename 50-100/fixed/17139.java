public void removeSlaveHost(java.lang.String host, boolean closeGently) throws java.sql.SQLException {
    if (this.slaveHostList.remove(host)) {
        (this.slavesRemoved)++;
        for (com.mysql.jdbc.ReplicationConnection c : this.replicationConnections.values()) {
            c.removeSlave(host, closeGently);
        }
    }
}