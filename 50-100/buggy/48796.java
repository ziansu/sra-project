@java.lang.Override
public void reduce(org.apache.hadoop.io.Text key, java.lang.Iterable<org.apache.hadoop.io.BytesWritable> values, Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String filename = getFilenameFromKey(key);
    filename = ((context.getConfiguration().get("BASE_OUTPUT_FILE_NAME")) + "n") + filename;
    for (org.apache.hadoop.io.BytesWritable value : values) {
        mos.write(key, value, filename);
    }
}