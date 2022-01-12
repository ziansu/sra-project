public void promoteSlaveToMaster(java.lang.String host) throws java.sql.SQLException {
    if ((this.slaveHostList.remove(host)) | (this.masterHostList.add(host))) {
        (this.slavesPromoted)++;
        for (com.mysql.jdbc.ReplicationConnection c : this.replicationConnections.values()) {
            c.promoteSlaveToMaster(host);
        }
    }
}