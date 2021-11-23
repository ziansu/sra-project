@java.lang.Override
public java.lang.Void call() throws java.io.IOException, java.lang.ClassNotFoundException, java.lang.InterruptedException {
    org.apache.hadoop.conf.Configuration conf = gobblin.util.HadoopUtils.getConfFromState(this.jobProps);
    org.apache.hadoop.mapreduce.Job job = org.apache.hadoop.mapreduce.Job.getInstance(conf);
    this.configureJob(job);
    this.submit(job);
    this.moveTmpPathToOutputPath();
    return null;
}