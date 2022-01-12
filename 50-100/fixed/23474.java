@java.lang.Override
public org.apache.hadoop.mapreduce.RecordWriter<org.apache.hadoop.io.WritableComparable<?>, org.apache.hadoop.io.Writable> getRecordWriter(org.apache.hadoop.mapreduce.TaskAttemptContext context) throws java.io.IOException {
    org.apache.hadoop.io.compress.CompressionCodec codec = null;
    org.apache.hadoop.io.SequenceFile.CompressionType compressionType = SequenceFile.CompressionType.NONE;
    if (getCompressOutput(context)) {
        compressionType = org.apache.hadoop.mapreduce.lib.output.SequenceFileOutputFormat.getOutputCompressionType(context);
        codec = getCompressionCodec(context);
    }
    org.apache.hadoop.fs.Path file = getDefaultWorkFile(context, "");
    final org.apache.hadoop.io.MapFile.Writer out = createMapFileWriter(context, codec, compressionType, file);
    return new org.mrgeo.hdfs.output.image.HdfsMrsPyramidOutputFormat.Writer(out);
}