private java.util.HashMap<java.lang.String, codingcareers.webapp.client.PageComponents.ProgressPanel> constructProgressBars() {
    java.util.HashMap<java.lang.String, codingcareers.webapp.client.PageComponents.ProgressPanel> progressBarCollection = new java.util.HashMap<>();
    for (java.lang.String task : codingcareers.webapp.client.Constants.TASK_SUBJECTS) {
        progressBarCollection.put(task, new codingcareers.webapp.client.PageComponents.ProgressPanel(task, getTaskCompleteness(task)));
    }
    return progressBarCollection;
}