@java.lang.Override
public boolean cancelJob(java.util.List<gr.tuc.softnet.core.NodeStatus> nodes, java.lang.String jobID) {
    gr.tuc.softnet.engine.MCJob job = jobInfo.get(jobID);
    if (job == null) {
        logger.error((("Job: " + jobID) + " is not handled bu this JobManager"));
        return dataTransport.cancelJob(jobID, jobID, new java.util.LinkedList<>());
    }else {
        cancelJob(jobID);
        return true;
    }
}