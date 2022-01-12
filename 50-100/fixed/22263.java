private boolean fetchValuesFromIndexCursor(final com.orientechnologies.orient.core.sql.OIndexCursor cursor) {
    int needsToFetch;
    if ((fetchLimit) > 0) {
        needsToFetch = (fetchLimit) + (skip);
    }else {
        needsToFetch = -1;
    }
    cursor.setPrefetchSize(needsToFetch);
    return fetchFromTarget(cursor);
}