@java.lang.Override
public java.lang.String getNonUniqueString() {
    java.lang.String columnStr = "";
    int length = columns.size();
    int i = 0;
    for (net.sf.jsqlparser.statement.create.table.ColumnDefinition colDef : columns) {
        columnStr += colDef.getColumnName();
        if (i < (length - 1)) {
            columnStr += ",";
        }
        ++i;
    }
    return java.lang.String.format("CREATE INDEX ON %s (%s);", this.name, table.getName(), columnStr);
}