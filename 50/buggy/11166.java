@java.lang.Override
public java.lang.String getColumnName(int column) throws java.sql.SQLException {
    return columns.get((column - 1));
}