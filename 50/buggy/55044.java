public void addJob(Job.Job NewJob) {
    Job.JobMap.put(NewJob.Name, NewJob);
    NewJob.Manager = this;
    JobsDirty = true;
}