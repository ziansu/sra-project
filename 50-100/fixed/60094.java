public static void main(java.lang.String[] args) throws java.lang.Exception {
    org.apache.hadoop.conf.Configuration conf = org.apache.hadoop.hbase.HBaseConfiguration.create();
    java.lang.String[] otherArgs = new org.apache.hadoop.util.GenericOptionsParser(conf, args).getRemainingArgs();
    if ((otherArgs.length) != 2) {
        java.lang.System.err.println("Usage: wordcount-hbase <table-name> <output-file>");
        java.lang.System.exit(2);
    }
    org.apache.hadoop.mapreduce.Job job = org.apache.hadoop.hbase.mapreduce.Export.createSubmittableJob(conf, otherArgs);
    java.lang.System.exit((job.waitForCompletion(true) ? 0 : 1));
}