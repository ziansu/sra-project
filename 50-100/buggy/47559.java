@java.lang.Override
public org.apache.hadoop.mapreduce.RecordReader<org.apache.hadoop.io.NullWritable, org.apache.hadoop.io.Text> createRecordReader(org.apache.hadoop.mapreduce.InputSplit split, org.apache.hadoop.mapreduce.TaskAttemptContext context) throws java.io.IOException {
    java.lang.System.out.println("Creating a recordReader for: ");
    java.lang.System.out.println(split.toString());
    manysmalltoone.CustomRecordReader reader = new manysmalltoone.CustomRecordReader();
    try {
        reader.initialize(split, context);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    return reader;
}