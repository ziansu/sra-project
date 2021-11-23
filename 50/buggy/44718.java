@java.lang.Override
public int getColumnIndex(java.lang.String columnName) {
    if (columnName.contains(columnName)) {
        return columnName.indexOf(columnName);
    }else {
        return -1;
    }
}