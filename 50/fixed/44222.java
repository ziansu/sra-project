public boolean addJob(model.Job job) {
    if (jobs.add(job))
        return true;
    
    return false;
}