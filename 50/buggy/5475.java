public long update(final com.lumens.sysdb.entity.Job job) {
    simplePrepareStatTransactionExecute(sqlManager.getSQL("JobDAO/UpdateJob"), job.id, job.name, job.description, job.repeat, job.interval, job.startTime, job.endTime);
    return job.id;
}