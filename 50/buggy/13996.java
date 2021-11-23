public org.gbif.utils.file.ClosableReportingIterator<java.lang.String[]> rowIterator() {
    try {
        org.gbif.utils.file.csv.CSVReader reader = getReader();
        return reader.iterator();
    } catch (java.io.IOException e) {
        org.gbif.ipt.model.TextFileSource.LOG.warn("Exception caught", e);
    }
    return null;
}