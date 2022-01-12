private void claimForm(final java.lang.String taskId) {
    try {
        restClient.claimForm(taskId);
    } catch (org.apache.syncope.common.lib.SyncopeClientException scee) {
        org.apache.syncope.client.console.SyncopeConsoleSession.get().error((((getString(Constants.ERROR)) + ": ") + (scee.getMessage())));
    }
}