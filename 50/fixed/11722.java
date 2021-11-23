@java.lang.Override
public void reduce(org.apache.hadoop.io.IntWritable key, java.lang.Iterable<org.apache.hadoop.io.IntWritable> values, edu.umd.cloud9.collection.medline.Context context) throws java.io.IOException, java.lang.InterruptedException {
    context.write(key, edu.umd.cloud9.collection.medline.NumberMedlineCitations2.MyReducer.cnt);
    edu.umd.cloud9.collection.medline.NumberMedlineCitations2.MyReducer.cnt.set(((edu.umd.cloud9.collection.medline.NumberMedlineCitations2.MyReducer.cnt.get()) + 1));
}