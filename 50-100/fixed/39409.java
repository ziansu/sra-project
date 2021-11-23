private int getColumnIndex(java.lang.String columnName) {
    java.util.Objects.requireNonNull(columnName);
    java.lang.String key = columnName.toLowerCase();
    java.lang.Integer index = mapcolumnNames.get(key);
    if (index == null) {
        throw new com.linuxense.javadbf.DBFException(("Not field name found for:" + columnName));
    }
    return index.intValue();
}