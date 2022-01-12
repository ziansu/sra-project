public hudson.util.FormValidation doTestConnection(@org.kohsuke.stapler.QueryParameter(value = "host")
final java.lang.String host, @org.kohsuke.stapler.QueryParameter(value = "username")
final java.lang.String username, @org.kohsuke.stapler.QueryParameter(value = "password")
final hudson.util.Secret password, @org.kohsuke.stapler.QueryParameter(value = "script")
final java.lang.String script) {
    try {
        org.jenkinsci.plugins.pollmailboxtrigger.mail.utils.CustomProperties properties = org.jenkinsci.plugins.pollmailboxtrigger.PollMailboxTrigger.initialiseDefaults(host, username, password, script);
        return org.jenkinsci.plugins.pollmailboxtrigger.PollMailboxTrigger.checkForEmails(properties, new org.jenkinsci.lib.xtrigger.XTriggerLog(new hudson.util.StreamTaskListener(Logger.DEFAULT.getOutputStream())), true, null, false);
    } catch (java.lang.Throwable t) {
        return hudson.util.FormValidation.error(("Error : " + (org.jenkinsci.plugins.pollmailboxtrigger.mail.utils.Stringify.stringify(t))));
    }
}