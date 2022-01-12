@java.lang.Override
public void removeJob(org.cytoscape.jobs.CyJob job) {
    synchronized(jobsList) {
        java.lang.System.out.println(("Removing job " + (job.toString())));
        jobsList.remove(job);
    }
    jobHandlerMap.remove(job);
    intervalMap.remove(job);
    if ((jobsList.size()) == 0) {
        resetTimer();
    }
}