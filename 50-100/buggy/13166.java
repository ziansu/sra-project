public boolean nextKeyValueOrg() throws java.io.IOException, java.lang.InterruptedException {
    while (((curReader) == null) || (!(curReader.nextKeyValue()))) {
        if (!(initNextRecordReader())) {
            org.apache.hadoop.mapreduce.approx.lib.input.SampleRecordReader.LOG.info("next:false");
            return false;
        }
    } 
    org.apache.hadoop.mapreduce.approx.lib.input.SampleRecordReader.LOG.info("next:true");
    return true;
}