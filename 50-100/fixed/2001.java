private void reopenIssues(final org.joda.time.LocalDate today) {
    for (final org.smartdeveloperhub.harvesters.it.backend.Issue issue : findIssuesByStatus(Status.CLOSED)) {
        if ((!(isInFlight(issue, today))) && (canReopen(issue))) {
            reopen(issue, today);
        }
    }
}