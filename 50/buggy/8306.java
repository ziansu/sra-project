@java.lang.Override
public void query(com.github.xiaoma.mysql.support.Query query, com.github.xiaoma.mysql.support.Callback... callback) throws java.sql.SQLException {
    if (queries.isEmpty()) {
        key.interestOps(java.nio.channels.SelectionKey.OP_WRITE);
    }
    queries.add(query);
}