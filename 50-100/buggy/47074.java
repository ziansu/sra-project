@java.lang.Override
public void write(byte[] record) throws java.io.IOException {
    com.google.common.base.Preconditions.checkNotNull(record);
    org.apache.commons.io.IOUtils.write(record, outputStream);
    if ((recordDelimiter) != null) {
        this.outputStream.writeChar(recordDelimiter);
    }
    (recordsWritten)++;
    bytesWritten += (record.length) + 1;
}