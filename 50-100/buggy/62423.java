public static javax.sql.XAConnection createXAConnection(java.sql.Connection physicalConn) throws java.sql.SQLException {
    com.alibaba.druid.util.ConnectionImpl mysqlConn = ((com.alibaba.druid.util.ConnectionImpl) (physicalConn));
    if (mysqlConn.getPinGlobalTxToPhysicalConnection()) {
        if (!(com.mysql.jdbc.Util.isJdbc4())) {
            return new com.mysql.jdbc.jdbc2.optional.SuspendableXAConnection(mysqlConn);
        }
        return new com.alibaba.druid.util.JDBC4SuspendableXAConnection(mysqlConn);
    }
    return new com.mysql.jdbc.jdbc2.optional.MysqlXAConnection(mysqlConn, false);
}