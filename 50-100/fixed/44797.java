public void addSlaveHost(java.lang.String host) throws java.sql.SQLException {
    if (this.slaveHostList.add(host)) {
        (this.slavesAdded)++;
        for (com.mysql.jdbc.ReplicationConnection c : this.replicationConnections.values()) {
            c.addSlaveHost(host);
        }
    }
}