public static boolean isAutoincrement(android.support.database.Column column) {
    return (column.isPrimaryKey()) && (android.support.database.util.TableUtil.isIntegerType(column.getType()));
}