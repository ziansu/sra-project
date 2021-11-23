@java.lang.Override
public void write(byte[] record) throws java.io.IOException {
    com.google.common.base.Preconditions.checkNotNull(record);
    this.outputStream.write(record);
    if ((recordDelimiter) != null) {
        this.outputStream.write(recordDelimiter);
        (bytesWritten)++;
    }
    (recordsWritten)++;
    bytesWritten += record.length;
}