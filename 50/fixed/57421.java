@java.lang.Override
public void close() {
    try {
        org.dbtools.android.domain.database.DatabaseWrapperUtil.closeStatements(insertStatementMap);
        org.dbtools.android.domain.database.DatabaseWrapperUtil.closeStatements(updateStatementMap);
        conn.close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}