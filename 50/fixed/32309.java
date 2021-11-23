@java.lang.Override
public void close() throws java.io.IOException {
    _isClosed.set(true);
    org.apache.hadoop.io.IOUtils.cleanup(org.apache.blur.manager.writer.BlurIndexSimpleWriter.LOG, makeCloseable(_watchForIdleBulkWriters), _indexImporter, _mutationQueueProcessor, makeCloseable(_writer.get()), _indexReader.get(), _directory);
}