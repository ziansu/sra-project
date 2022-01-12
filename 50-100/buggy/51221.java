@java.lang.Override
public synchronized void close(org.apache.hadoop.mapred.Reporter reporter) throws java.io.IOException {
    try {
        this.officeWriter.finalizeWrite();
    } catch (org.zuinnote.hadoop.office.format.mapred.OfficeWriterException e) {
        org.zuinnote.hadoop.office.format.mapred.AbstractSpreadSheetDocumentRecordWriter.LOG.error(e);
    } finally {
        if ((this.currentReader) != null) {
            this.currentReader.close();
        }
    }
}