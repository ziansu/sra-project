public org.apache.ignite.internal.processors.odbc.jdbc.JdbcQueryFetchResult queryFetch(java.lang.Long qryId, int pageSize) throws java.io.IOException, org.apache.ignite.IgniteCheckedException {
    org.apache.ignite.internal.processors.odbc.jdbc.JdbcUtils.setReadSqlObject(true);
    return sendRequest(new org.apache.ignite.internal.processors.odbc.jdbc.JdbcQueryFetchRequest(qryId, pageSize), org.apache.ignite.internal.jdbc.thin.JdbcThinTcpIo.QUERY_FETCH_MSG_SIZE);
}