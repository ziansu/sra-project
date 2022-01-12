private java.lang.Object copy(final com.orientechnologies.orient.core.record.impl.ODocument document, final java.lang.Object[] iFieldNames) {
    final com.orientechnologies.orient.core.record.impl.ODocument doc = document.copy();
    for (java.lang.Object iFieldName : iFieldNames) {
        if (iFieldName != null) {
            final java.lang.String fieldName = iFieldName.toString();
            doc.removeField(fieldName);
        }
    }
    doc.deserializeFields();
    return doc;
}