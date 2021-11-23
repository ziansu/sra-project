private void doAfterDelegate(int taskCompletionTimeout, java.lang.String operation) {
    if (taskCompletionTimeout >= 0) {
        int timeout = (taskCompletionTimeout == 0) ? configuration.getTaskCompletionTimeout() : taskCompletionTimeout;
        java.lang.String failureMessage = ((("After operation " + operation) + "() the system remained busy exceeding the timeout of ") + taskCompletionTimeout) + " ms";
        org.aludratest.service.util.TaskCompletionUtil.waitForActivityAndCompletion(systemConnector, failureMessage, configuration.getTaskStartTimeout(), timeout, configuration.getTaskPollingInterval());
    }
}