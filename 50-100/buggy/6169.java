public void removeMasterHost(java.lang.String host, boolean closeGently) throws java.sql.SQLException {
    if (this.masterHostList.remove(host)) {
    }
    for (com.mysql.jdbc.ReplicationConnection c : this.replicationConnections.values()) {
        c.removeMasterHost(host, closeGently);
    }
}