private java.lang.Object copy(final com.orientechnologies.orient.core.record.impl.ODocument document, final java.lang.Object[] iFieldNames) {
    final com.orientechnologies.orient.core.record.impl.ODocument doc = document.copy();
    com.orientechnologies.orient.core.record.ORecordInternal.setIdentity(doc, ORecordId.EMPTY_RECORD_ID);
    for (java.lang.Object iFieldName : iFieldNames) {
        if (iFieldName != null) {
            final java.lang.String fieldName = iFieldName.toString();
            doc.removeField(fieldName);
        }
    }
    doc.deserializeFields();
    return doc;
}