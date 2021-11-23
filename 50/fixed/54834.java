public <T extends org.projectbuendia.client.diagnostics.HealthIssue> void onDiscovered(T healthIssue) {
    synchronized(mIssuesLock) {
        mActiveIssues.add(healthIssue);
    }
    postTroubleshootingEvents(null);
}