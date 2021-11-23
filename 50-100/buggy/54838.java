private void skipOffsetRow(org.apache.tajo.master.exec.NonForwardQueryResultScanner queryResultScanner, int offset) throws java.io.IOException {
    if (offset < 0) {
        return ;
    }
    int currentRow = queryResultScanner.getCurrentRowNumber();
    if (offset < (currentRow + 1)) {
        throw new java.lang.RuntimeException("Offset must be over the current row number");
    }
    queryResultScanner.getNextRows(((offset - currentRow) - 1));
}