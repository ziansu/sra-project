private static synchronized void flushLog(us.kbase.narrativejobservice.NarrativeJobServiceClient jobSrvClient, java.lang.String jobId, java.util.List<us.kbase.narrativejobservice.LogLine> logLines) {
    if (logLines.isEmpty())
        return ;
    
    try {
        jobSrvClient.addJobLogs(jobId, logLines);
        logLines.clear();
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}