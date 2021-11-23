@java.lang.Override
public org.apache.lucene.index.Fields getTermVectors(int docID) throws java.io.IOException {
    ensureOpen();
    org.apache.lucene.index.ParallelAtomicReader.ParallelFields fields = new org.apache.lucene.index.ParallelAtomicReader.ParallelFields();
    for (java.util.Map.Entry<java.lang.String, org.apache.lucene.index.AtomicReader> ent : fieldToReader.entrySet()) {
        java.lang.String fieldName = ent.getKey();
        org.apache.lucene.index.Terms vector = ent.getValue().getTermVector(docID, fieldName);
        if (vector != null) {
            fields.addField(fieldName, vector);
        }
    }
    return fields;
}