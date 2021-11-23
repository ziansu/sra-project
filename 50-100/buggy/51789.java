private void submitSorting() {
    final T[] records = ramRecords;
    final int nRecords = numRecordsInRam;
    this.ramRecords = ((T[]) (java.lang.reflect.Array.newInstance(componentType, maxRecordsInRam)));
    numRecordsInRam = 0;
    executor.submit(() -> {
        spillToDisk(records, nRecords, codec.clone());
    });
}