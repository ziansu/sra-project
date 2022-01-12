public void onResolved(org.projectbuendia.client.diagnostics.HealthIssue healthIssue) {
    synchronized(mIssuesLock) {
        if (!(mActiveIssues.remove(healthIssue))) {
            org.projectbuendia.client.diagnostics.Troubleshooter.LOG.w(("Attempted to remove health issue '%1$s' that the troubleshooter was not " + "previously aware of."), healthIssue.toString());
        }
    }
    postTroubleshootingEvents(healthIssue);
}