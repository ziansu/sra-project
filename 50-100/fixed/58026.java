@java.lang.Override
public java.lang.String parseRow(android.database.Cursor cursor) {
    java.lang.String name = cursor.getString(cursor.getColumnIndexOrThrow("name"));
    if (name.endsWith("_id")) {
        java.lang.String tableName = name.substring(0, name.lastIndexOf('_'));
        if (tables.contains((tableName + "s"))) {
            return tableName + "s";
        }else
            if (tables.contains(tableName)) {
                return tableName;
            }
        
    }
    return null;
}