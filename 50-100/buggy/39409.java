private int getColumnIndex(java.lang.String columnName) {
    java.util.Objects.requireNonNull(columnName);
    java.lang.String key = columnName.toLowerCase();
    if (key == null) {
        throw new com.linuxense.javadbf.DBFException(("Not field name found for:" + columnName));
    }
    return mapcolumnNames.get(key);
}