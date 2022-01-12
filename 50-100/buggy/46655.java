public boolean invokeNext(com.gkwen.xsensor.xcore.job.JobContext jobContext) {
    if ((cursor) >= (valves.size())) {
        return false;
    }
    (cursor)++;
    valves.get(cursor).process(jobContext);
    return this.invokeNext(jobContext);
}