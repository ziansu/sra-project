@java.lang.Override
public com.pratilipi.data.DataListCursorTuple<com.pratilipi.data.type.User> getUserList(java.lang.String cursor, java.lang.Integer resultCount) {
    return getUserList(cursor, resultCount, false);
}