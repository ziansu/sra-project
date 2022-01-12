public hudson.model.Run getRun() {
    if ((run) == null) {
        final hudson.model.Job job = jenkins.model.Jenkins.getInstance().getItemByFullName(jobName, hudson.model.Job.class);
        if (job != null) {
            this.run = job.getBuildByNumber(buildNumber);
        }
    }
    return run;
}