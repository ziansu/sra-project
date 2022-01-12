public java.lang.Object getSelection(int key, java.lang.String columnName) {
    if ((selection) != null) {
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> record = selection.get(key);
        if (record != null) {
            return record.get(columnName);
        }
    }
    return null;
}