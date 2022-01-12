public java.util.Collection<org.omg.bpmn.miwg.api.AnalysisRun> executeAnalysisJobs(java.util.Collection<org.omg.bpmn.miwg.api.AnalysisJob> jobs) throws java.lang.Exception {
    java.util.Collection<org.omg.bpmn.miwg.api.AnalysisRun> runs = new java.util.LinkedList<org.omg.bpmn.miwg.api.AnalysisRun>();
    for (org.omg.bpmn.miwg.api.AnalysisJob job : jobs) {
        org.omg.bpmn.miwg.api.AnalysisRun run = executeAnalysisJob(job);
        runs.add(run);
    }
    org.omg.bpmn.miwg.util.HTMLAnalysisOutputWriter.writeOverview(outputFolder, runs);
    return runs;
}