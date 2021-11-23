public boolean invokeNext(com.gkwen.xsensor.xcore.job.JobContext jobContext) {
    if ((cursor) >= (valves.size())) {
        return false;
    }
    valves.get(cursor).process(jobContext);
    (cursor)++;
    return this.invokeNext(jobContext);
}