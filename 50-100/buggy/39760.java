@java.lang.Override
public java.util.Collection<java.lang.String> getFieldNames(org.apache.lucene.index.IndexReader.FieldOption fieldNames) {
    org.apache.lucene.index.BaseMultiReader.ensureOpen();
    java.util.Set<java.lang.String> fieldSet = new java.util.HashSet<java.lang.String>();
    for (org.apache.lucene.index.IndexReader reader : subReaders) {
        java.util.Collection<java.lang.String> names = reader.getFieldNames(fieldNames);
        fieldSet.addAll(names);
    }
    return fieldSet;
}