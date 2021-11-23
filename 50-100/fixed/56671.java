public java.util.List<annis.automation.scheduling.AutomatedQuery> getQueries() {
    checkConfiguration();
    int size = tasks.size();
    java.util.List<annis.automation.scheduling.AutomatedQuery> result = new java.util.ArrayList<>(size);
    for (annis.automation.scheduling.AutomatedQueryTask task : tasks.values()) {
        result.add(task.getQuery());
    }
    return result;
}