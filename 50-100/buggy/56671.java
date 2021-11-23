public java.util.List<annis.automation.scheduling.AutomatedQuery> getQueries() {
    checkConfiguration();
    java.util.List<annis.automation.scheduling.AutomatedQuery> result = new java.util.ArrayList<>();
    for (annis.automation.scheduling.AutomatedQueryTask task : tasks.values()) {
        result.add(task.getQuery());
    }
    return result;
}