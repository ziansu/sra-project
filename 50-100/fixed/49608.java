@java.lang.Override
public void map(org.apache.hadoop.io.Text key, org.apache.hadoop.io.BytesWritable value, org.opencb.hadoop_pore.Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.System.out.println(("***** map: key = " + key));
    java.lang.String info = new org.opencb.hadoop_pore.NativePoreSupport().getInfo(value.getBytes());
    org.opencb.hadoop_pore.StatsWritable finalStats = new org.opencb.hadoop_pore.StatsWritable();
    if (info != null) {
        java.lang.System.out.println(info);
    }
    java.lang.System.out.println(("+++++ from map: stats:\n" + (finalStats.toString())));
    context.write(new org.apache.hadoop.io.Text("hello"), finalStats);
}