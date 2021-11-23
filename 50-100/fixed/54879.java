@java.lang.Override
protected void map(org.apache.hadoop.io.LongWritable key, org.apache.hadoop.io.Text value, fr.eurecom.dsg.mapreduce.Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String line = value.toString();
    java.lang.String[] words = line.split("\\s+");
    for (java.lang.String word : words) {
        textValue.set(word);
        context.write(textValue, ONE);
    }
}