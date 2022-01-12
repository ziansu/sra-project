@java.lang.Override
public java.util.Collection<java.lang.String> getFieldNames(org.apache.lucene.index.IndexReader.FieldOption fieldNames) {
    org.apache.lucene.index.BaseMultiReader.ensureOpen();
    final java.util.Set<java.lang.String> fieldSet = new java.util.HashSet<java.lang.String>();
    for (org.apache.lucene.index.IndexReader reader : subReaders) {
        fieldSet.addAll(reader.getFieldNames(fieldNames));
    }
    return fieldSet;
}