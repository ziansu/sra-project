public boolean goalsFulfilled() {
    for (int i = 0; i < (source.JobManager.jobs.size()); i++) {
        if (source.JobManager.jobs.get(i).jobType.eqauls('g')) {
            if (source.JobManager.jobs.get(i).solved) {
            }else {
                return false;
            }
        }
    }
    return true;
}