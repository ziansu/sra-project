@java.lang.Override
protected boolean checkIfModified(org.jenkinsci.plugins.pollmailboxtrigger.Node executingNode, org.jenkinsci.lib.xtrigger.XTriggerLog log) {
    org.jenkinsci.plugins.pollmailboxtrigger.mail.utils.CustomProperties properties = org.jenkinsci.plugins.pollmailboxtrigger.PollMailboxTrigger.initialiseDefaults(host, username, password, script);
    org.jenkinsci.plugins.pollmailboxtrigger.PollMailboxTrigger.checkForEmails(properties, log, false, this);
    return false;
}