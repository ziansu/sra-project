public void addStream(long offset, org.apache.hadoop.hive.ql.io.orc.OrcProto.Stream stream, int indexIx) {
    streams[(++(streamCount))] = new org.apache.hadoop.hive.ql.io.orc.RecordReaderImpl.StreamContext(stream, offset, indexIx);
}