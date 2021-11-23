public static void injectSystemProperties(org.apache.hadoop.mapreduce.Job job) {
    final org.apache.hadoop.conf.Configuration conf = job.getConfiguration();
    for (java.lang.String propName : java.lang.System.getProperties().stringPropertyNames()) {
        if (propName.startsWith("hadoop.")) {
            conf.set(propName.substring("hadoop.".length()), java.lang.System.getProperty(propName));
        }
    }
}