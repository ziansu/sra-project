@java.lang.Override
public void onAfterExecuteQuery(com.p6spy.engine.common.PreparedStatementInformation statementInformation, long timeElapsedNanos, java.sql.SQLException e) {
    if (e != null) {
        super.onAfterExecuteQuery(statementInformation, timeElapsedNanos, e);
    }else {
        onAfterExecuteQueryWithoutClosingSpan(statementInformation);
    }
}