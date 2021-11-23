public void release(final com.orientechnologies.orient.client.binary.OChannelBinaryAsynchClient conn) {
    if (conn == null)
        return ;
    
    final com.orientechnologies.orient.client.remote.ORemoteConnectionPool pool = connections.get(conn.getServerURL());
    if (pool != null) {
        if (!(conn.isConnected())) {
            com.orientechnologies.common.log.OLogManager.instance().debug(this, "Network connection pool is receiving a closed connection to reuse: discard it");
            remove(conn);
        }else {
            pool.getPool().returnResource(conn);
        }
    }
}