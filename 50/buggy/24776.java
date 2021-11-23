@java.lang.Override
public void close() {
    if ((csvListReader) != null) {
        try {
            csvListReader.close();
        } catch (java.io.IOException e) {
            org.gbif.utils.file.tabular.SuperCsvFileReader.LOG.warn("Exception while closing tabular data file", e);
        }
    }
}