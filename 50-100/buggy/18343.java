private java.util.Collection<org.datacleaner.api.InputRow> getInputRowCollection(int defaultSize, org.datacleaner.storage.RowAnnotation annotation) {
    java.util.List<org.datacleaner.api.InputRow> rowCollection = _storage.get(annotation);
    if (rowCollection == null) {
        if ((_storage.size()) > (_maxSampleSets)) {
            return null;
        }
        rowCollection = new java.util.ArrayList<org.datacleaner.api.InputRow>(defaultSize);
        final java.util.List<org.datacleaner.api.InputRow> existingCollection = _storage.putIfAbsent(annotation, rowCollection);
        if (existingCollection != null) {
            rowCollection = existingCollection;
        }
    }
    return rowCollection;
}