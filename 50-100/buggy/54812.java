private static <J, S, D, I> void setValue(org.spine3.server.entity.storage.Column.MemoizedValue<J> columnValue, D destination, I columnIdentifier, org.spine3.server.entity.storage.ColumnType<J, S, D, I> columnType) {
    final org.spine3.server.entity.storage.J initialValue = columnValue.getValue();
    if (initialValue == null) {
        columnType.setNull(destination, columnIdentifier);
    }else {
        final org.spine3.server.entity.storage.S storedValue = columnType.convertColumnValue(initialValue);
        columnType.setColumnValue(destination, storedValue, columnIdentifier);
    }
}