public void processPages(long recordsToReadInThisPass) throws java.io.IOException {
    reset();
    if (recordsToReadInThisPass > 0) {
        do {
            determineSize(recordsToReadInThisPass, 0);
        } while (((valuesReadInCurrentPass) < recordsToReadInThisPass) && (pageReader.hasPage()) );
    }
    org.apache.drill.exec.store.parquet.columnreaders.ColumnReader.logger.trace("Column Reader: {} - Values read in this pass: {} - ", this.getColumnDescriptor().toString(), valuesReadInCurrentPass);
    valueVec.getMutator().setValueCount(valuesReadInCurrentPass);
}