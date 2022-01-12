@java.lang.Override
public int getColumnIndex(java.lang.String columnName) {
    if (names.contains(columnName)) {
        return names.indexOf(columnName);
    }else {
        return -1;
    }
}