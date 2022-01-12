private void claimForm(final java.lang.String taskId) {
    try {
        restClient.claimForm(taskId);
        org.apache.syncope.client.console.SyncopeConsoleSession.get().info(getString(Constants.OPERATION_SUCCEEDED));
    } catch (org.apache.syncope.common.lib.SyncopeClientException scee) {
        org.apache.syncope.client.console.SyncopeConsoleSession.get().error((((getString(Constants.ERROR)) + ": ") + (scee.getMessage())));
    }
}