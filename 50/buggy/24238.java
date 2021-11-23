@java.lang.Override
public java.lang.String toSQLString() {
    if ((tableName.getAlias()) != null) {
        return (tableName.getAlias()) + (n);
    }
}