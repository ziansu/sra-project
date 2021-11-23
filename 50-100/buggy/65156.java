public void promoteSlaveToMaster(java.lang.String host) throws java.sql.SQLException {
    this.slaveHostList.remove(host);
    this.masterHostList.add(host);
    for (com.mysql.jdbc.ReplicationConnection c : this.replicationConnections.values()) {
        c.promoteSlaveToMaster(host);
    }
    (this.slavesPromoted)++;
}