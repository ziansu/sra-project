public void map(org.apache.hadoop.io.LongWritable key, org.apache.hadoop.io.Text value, Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String line = value.toString();
    java.lang.String[] line_values = line.split("\t");
    context.write(new org.apache.hadoop.io.Text(line_values[0]), new org.apache.hadoop.io.Text((((((line_values[0]) + "\t") + (line_values[1])) + "\t") + (line_values[2]))));
}