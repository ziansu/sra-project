private java.util.ArrayList<codingcareers.webapp.client.PageComponents.ProgressPanel> constructProgressBars() {
    java.util.ArrayList<codingcareers.webapp.client.PageComponents.ProgressPanel> progressBarCollection = new java.util.ArrayList<>();
    for (java.lang.String task : codingcareers.webapp.client.Constants.TASK_SUBJECTS) {
        progressBarCollection.add(new codingcareers.webapp.client.PageComponents.ProgressPanel(task, getTaskCompleteness(task)));
    }
    return progressBarCollection;
}