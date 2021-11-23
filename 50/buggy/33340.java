public hudson.model.Job getJob() {
    if ((job) == null) {
        job = jenkins.model.Jenkins.getInstance().getItemByFullName(jobName, hudson.model.Job.class);
    }
    return job;
}