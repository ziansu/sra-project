@java.lang.Override
public void removeJob(org.cytoscape.jobs.CyJob job) {
    synchronized(jobsList) {
        jobsList.remove(job);
    }
    jobHandlerMap.remove(job);
    intervalMap.remove(job);
    if ((jobsList.size()) == 0) {
        resetTimer();
    }
}