protected tap.data.TableIterator createTableIterator(final java.sql.ResultSet rs, final adql.db.DBColumn[] resultingColumns) throws tap.data.DataReadException {
    java.sql.Statement itStmt = stmt;
    stmt = null;
    try {
        return new tap.data.ResultSetTableIterator(itStmt, rs, translator, dbms, resultingColumns);
    } catch (java.lang.Throwable t) {
        throw t instanceof tap.data.DataReadException ? ((tap.data.DataReadException) (t)) : new tap.data.DataReadException(t);
    }
}