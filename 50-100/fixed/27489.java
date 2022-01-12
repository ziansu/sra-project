private void addInputRowsToCollection(java.util.Collection<org.datacleaner.api.InputRow> rowCollection, java.util.Collection<org.datacleaner.api.InputRow> rows) {
    if (rowCollection == null) {
        return ;
    }
    int size = rowCollection.size();
    if (size >= (_maxSampleRecords)) {
        return ;
    }
    for (org.datacleaner.api.InputRow inputRow : rows) {
        synchronized(rowCollection) {
            rowCollection.add(inputRow);
            size++;
            if (size >= (_maxSampleRecords)) {
                return ;
            }
        }
    }
}