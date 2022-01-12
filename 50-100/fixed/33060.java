private results.JiraIssueWithPredictedTimeToResolve getRealIssue(java.util.List<results.JiraIssueWithPredictedTimeToResolve> issues, database.entity.AssignedIssue assignedIssue) {
    for (results.JiraIssueWithPredictedTimeToResolve jiraIssueWithPredictedTimeToResolve : issues) {
        if (jiraIssueWithPredictedTimeToResolve.getAssigneeTimeResolve().getAssignee().equals(assignedIssue.getAssignee())) {
            return jiraIssueWithPredictedTimeToResolve;
        }
    }
    throw new main.RealIssueNotFoundException(assignedIssue);
}