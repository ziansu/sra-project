public void trigger(final org.graylog2.plugin.streams.Stream stream, final org.graylog2.plugin.alarms.AlertCondition.CheckResult checkResult) throws org.graylog2.plugin.alarms.callbacks.AlarmCallbackException {
    try {
        net.rcarz.jiraclient.BasicCredentials creds = new net.rcarz.jiraclient.BasicCredentials(JIRAUserName, JIRAPassword);
        jiraClient = new net.rcarz.jiraclient.JiraClient(JIRAServerURL, creds);
        if ((isDuplicateJiraIssue()) == false) {
            createJIRAIssue();
        }
    } catch (java.lang.Exception e) {
        throw new org.graylog2.plugin.alarms.callbacks.AlarmCallbackException(e.getMessage());
    }
}