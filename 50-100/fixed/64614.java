@java.lang.Override
public org.apache.hadoop.mapred.RecordReader<java.lang.Void, org.apache.hadoop.io.ArrayWritable> getRecordReader(org.apache.hadoop.mapred.InputSplit inputSplit, org.apache.hadoop.mapred.JobConf jobConf, org.apache.hadoop.mapred.Reporter reporter) throws java.io.IOException {
    java.lang.System.out.println(("Get record reader:" + (inputSplit.toString())));
    org.apache.carbondata.core.scan.model.QueryModel queryModel = getQueryModel(((org.apache.carbondata.hadoop.CarbonInputSplit) (inputSplit)), jobConf);
    org.apache.carbondata.hadoop.readsupport.CarbonReadSupport<org.apache.hadoop.io.ArrayWritable> readSupport = getReadSupportClass(jobConf);
    return new org.apache.carbondata.hadoop.CarbonRecordReader<org.apache.hadoop.io.ArrayWritable>(queryModel, readSupport, inputSplit, jobConf);
}