public final void writeHeaders(java.lang.String... headers) {
    if ((recordCount) > 0) {
        throwExceptionAndClose("Cannot write headers after records have been written", headers, null);
    }
    if ((headers != null) && ((headers.length) > 0)) {
        processRow(headers);
        writeRow();
    }else {
        throwExceptionAndClose("No headers defined", headers, null);
    }
}