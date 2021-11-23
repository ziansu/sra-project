public RecordReader<Text, Text> getRecordReader(InputSplit split, JobConf conf, Reporter reporter) throws java.io.IOException {
    reporter.setStatus(split.toString());
    return new Ngram.PageRecordReader(conf, ((FileSplit) (split)));
}