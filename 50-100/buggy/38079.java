@java.lang.Override
public void consume(org.spine3.client.QueryOperator operator, org.spine3.server.entity.storage.Column<?> column, @javax.annotation.Nullable
java.lang.Object value) {
    if (!(currentlyMatches)) {
        return ;
    }
    final java.lang.String columnName = column.getName();
    final org.spine3.server.entity.storage.Column.MemoizedValue<?> actualValue = entityColumns.get(columnName);
    currentlyMatches = (actualValue != null) && (org.spine3.client.QueryOperator.compare(actualValue.getValue(), operator, value));
}