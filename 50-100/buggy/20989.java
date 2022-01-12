@java.lang.Override
public void annotate(org.datacleaner.api.InputRow row, org.datacleaner.storage.RowAnnotation annotation) {
    super.annotate(row, annotation);
    final java.util.Collection<org.datacleaner.api.InputRow> rowCollection = getInputRowCollection(10, annotation);
    if (rowCollection != null) {
        if ((rowCollection.size()) >= (_maxSampleRecords)) {
            return ;
        }
        rowCollection.add(row);
    }
}