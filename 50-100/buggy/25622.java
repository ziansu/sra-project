@java.lang.Override
public void reduce(org.apache.hadoop.io.Text inputKey, java.lang.Iterable<org.apache.hadoop.io.LongWritable> values, Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.Long totalViews = ((long) (0));
    for (org.apache.hadoop.io.LongWritable value : values) {
        totalViews += value.get();
    }
    Views_Reducer.finalOutput.put(totalViews, inputKey.toString());
    if ((Views_Reducer.finalOutput.size()) > 10) {
        Views_Reducer.finalOutput.remove(Views_Reducer.finalOutput.lastKey());
    }
}