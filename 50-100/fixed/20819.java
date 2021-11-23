public static boolean goalsFulfilled() {
    for (int i = 0; i < (source.JobManager.jobs.size()); i++) {
        if ((source.JobManager.jobs.get(i).jobType) == 'g') {
            if (source.JobManager.jobs.get(i).solved) {
            }else {
                return false;
            }
        }
    }
    return true;
}