public void close() throws java.io.IOException {
    writeIntToBuffer(org.apache.spark.util.collection.unsafe.sort.UnsafeSorterSpillWriter.EOF_MARKER, 0);
    writer.write(writeBuffer, 0, 4);
    writer.commitAndClose();
    writer = null;
    writeBuffer = null;
}