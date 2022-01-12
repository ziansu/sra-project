public org.gbif.utils.file.ClosableReportingIterator<java.lang.String[]> rowIterator() {
    try {
        return getReader();
    } catch (java.io.IOException e) {
        org.gbif.ipt.model.TextFileSource.LOG.warn("Exception caught", e);
    }
    return null;
}