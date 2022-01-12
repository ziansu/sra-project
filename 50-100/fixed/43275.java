public hudson.model.Run getRun() {
    if ((this.run) == null) {
        final hudson.model.Job job = jenkins.model.Jenkins.getInstance().getItemByFullName(this.jobName, hudson.model.Job.class);
        if (job != null) {
            this.run = job.getBuildByNumber(this.buildNumber);
        }
    }
    return this.run;
}