private static com.orientechnologies.orient.core.record.impl.ODocument getDocument(final com.orientechnologies.orient.core.db.record.OIdentifiable id, final boolean forceReload) {
    final com.orientechnologies.orient.core.record.impl.ODocument doc = id.getRecord();
    if ((doc != null) && forceReload) {
        try {
            doc.reload();
        } catch (com.orientechnologies.orient.core.exception.ORecordNotFoundException e) {
        }
    }
    return doc;
}