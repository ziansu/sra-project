private void addJobOutput(com.kylinolap.job2.impl.threadpool.AbstractExecutable executable) throws com.kylinolap.job2.exception.PersistentException {
    jobDao.addJobOutput(executable.getJobOutput());
    if (executable instanceof com.kylinolap.job2.impl.threadpool.DefaultChainedExecutable) {
        for (com.kylinolap.job2.impl.threadpool.AbstractExecutable subTask : ((com.kylinolap.job2.impl.threadpool.DefaultChainedExecutable) (executable)).getTasks()) {
            addJob(subTask);
        }
    }
}