public final void close() {
    try {
        this.headerIndexes = null;
        if ((writer) != null) {
            writer.close();
            writer = null;
        }
    } catch (java.lang.Throwable ex) {
        throw new java.lang.IllegalStateException("Error closing the output.", ex);
    }
    if ((this.partialLineIndex) != 0) {
        throw new com.univocity.parsers.common.TextWritingException(("Not all values associated with the last record have been written to the output. " + "\n\tHint: use \'writeValuesToRow()\' or \'writeValuesToString()\' to flush the partially written values to a row."), recordCount, java.util.Arrays.copyOf(partialLine, partialLineIndex));
    }
}