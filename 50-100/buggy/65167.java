@java.lang.Override
public int getInt(int columnIndex) {
    long messageId = getLong(mMessageIdColumn);
    long threadRootId = getLong(mThreadRootColumn);
    java.lang.String columnName = getColumnName(columnIndex);
    java.lang.String value = mCache.getValueForMessage(messageId, columnName);
    if (value != null) {
        return java.lang.Integer.valueOf(value);
    }
    value = mCache.getValueForThread(threadRootId, columnName);
    if (value != null) {
        return java.lang.Integer.valueOf(value);
    }
    return super.getInt(columnIndex);
}