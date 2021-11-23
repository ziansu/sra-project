private org.apache.cassandra.heartbeat.status.Status getStatus(java.lang.String key) {
    org.apache.cassandra.heartbeat.status.Status status = m_keyStatusMap.get(key);
    if (status == null) {
        org.apache.cassandra.heartbeat.status.Status temp = new org.apache.cassandra.heartbeat.status.Status();
        status = m_keyStatusMap.putIfAbsent(key, status);
        if (status == null)
            status = temp;
        
    }
    return status;
}