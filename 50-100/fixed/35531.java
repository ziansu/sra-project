protected tap.data.TableIterator createTableIterator(final java.sql.ResultSet rs, final adql.db.DBColumn[] resultingColumns) throws tap.data.DataReadException {
    try {
        return new tap.data.ResultSetTableIterator(this, rs, resultingColumns, translator, dbms);
    } catch (java.lang.Throwable t) {
        throw t instanceof tap.data.DataReadException ? ((tap.data.DataReadException) (t)) : new tap.data.DataReadException(t);
    }
}