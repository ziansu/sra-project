@java.lang.Override
public void configure(org.apache.hadoop.mapred.JobConf job) {
    super.configure(job);
    java.lang.String[] temp = job.get("timedistance").split(",");
    this.time = temp[1];
    this.interval = java.lang.Integer.parseInt(temp[0]);
    this.distance = java.lang.Integer.parseInt(job.get("spacedistance"));
}