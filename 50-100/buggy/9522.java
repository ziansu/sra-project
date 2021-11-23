@java.lang.Override
protected void map(org.apache.hadoop.io.LongWritable key, org.mrgeo.geometry.Geometry value, org.mrgeo.data.geowave.vector.Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.System.out.println(("Key: " + (key.get())));
    java.lang.System.out.println(("Value: " + value));
    context.write(new org.apache.hadoop.io.Text(("" + (key.get()))), new org.apache.hadoop.io.Text(value.toString()));
}