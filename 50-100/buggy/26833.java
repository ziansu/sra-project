@java.lang.Override
boolean isItemEnabled(android.database.Cursor cursor) {
    if ((cursor.getPosition()) == 0) {
        return true;
    }
    if ((cursor.getInt(KeyAdapter.INDEX_IS_REVOKED)) != 0) {
        return false;
    }
    if ((cursor.getInt(KeyAdapter.INDEX_IS_EXPIRED)) != 0) {
        return false;
    }
    if (cursor.isNull(mIndexHasSign)) {
        return false;
    }
    return true;
}