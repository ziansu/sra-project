public java.util.ArrayList<com.democracyapps.cnp.graphanalyzer.tasks.AnalysisTask> getTasksToRun() {
    java.util.ArrayList<com.democracyapps.cnp.graphanalyzer.tasks.AnalysisTask> tasks = new java.util.ArrayList<com.democracyapps.cnp.graphanalyzer.tasks.AnalysisTask>();
    if ((tasksById) != null) {
        for (com.democracyapps.cnp.graphanalyzer.tasks.AnalysisTask t : tasksById.values()) {
            tasks.add(t);
        }
    }
    return tasks;
}