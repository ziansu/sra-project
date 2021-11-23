@java.lang.Override
public void onAfterExecuteQuery(com.p6spy.engine.common.StatementInformation statementInformation, long timeElapsedNanos, java.lang.String sql, java.sql.SQLException e) {
    onAfterExecuteQueryWithoutClosingSpan(statementInformation, timeElapsedNanos, e);
}