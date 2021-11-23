private void findColumnsFromCursor(android.database.Cursor c, java.lang.String[] from) {
    int i;
    int count = from.length;
    if (((mFrom) == null) || ((mFrom.length) != count)) {
        mFrom = new int[count];
    }
    for (i = 0; i < count; i++) {
        mFrom[i] = c.getColumnIndexOrThrow(from[i]);
    }
}