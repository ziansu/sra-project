@java.lang.Override
public synchronized void close(org.apache.hadoop.mapreduce.TaskAttemptContext context) throws java.io.IOException {
    try {
        this.officeWriter.finalizeWrite();
    } catch (org.zuinnote.hadoop.office.format.mapreduce.OfficeWriterException e) {
        org.zuinnote.hadoop.office.format.mapreduce.AbstractSpreadSheetDocumentRecordWriter.LOG.error(e);
    } finally {
        if ((this.currentReader) != null) {
            this.currentReader.close();
        }
    }
}