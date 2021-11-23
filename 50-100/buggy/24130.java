private int getCurrentRecordNumber() throws java.sql.SQLException {
    if (cursor.getResultSet().isBeforeFirst()) {
        throw new org.apache.drill.jdbc.InvalidCursorStateSqlException("Result set cursor is positioned before all rows.  Call next() first.");
    }else
        if (cursor.getResultSet().isAfterLast()) {
            throw new org.apache.drill.jdbc.InvalidCursorStateSqlException("Result set cursor is already positioned past all rows.");
        }else {
            return cursor.getCurrentRecordNumber();
        }
    
}