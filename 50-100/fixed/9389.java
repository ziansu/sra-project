@java.lang.Override
public void close() throws java.sql.SQLException {
    com.mysql.jdbc.MySQLConnection locallyScopedConn = this.connection;
    if (locallyScopedConn == null) {
        return ;
    }
    synchronized(locallyScopedConn.getConnectionMutex()) {
        if (((this.isCached) && (isPoolable())) && (!(this.isClosed))) {
            clearParameters();
            this.isClosed = true;
            this.connection.recachePreparedStatement(this);
            return ;
        }
        this.isClosed = false;
        realClose(true, true);
    }
}