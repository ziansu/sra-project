@java.lang.SuppressWarnings(value = "unchecked")
public static java.lang.Object getEnum(android.database.Cursor cursor, java.lang.Class<?> fieldType, int columnIndex) {
    @java.lang.SuppressWarnings(value = "rawtypes")
    final java.lang.Class<? extends java.lang.Enum> enumType = ((java.lang.Class<? extends java.lang.Enum>) (fieldType));
    return java.lang.Enum.valueOf(enumType, cursor.getString(columnIndex));
}