private boolean isMailingEnabledAndValid() {
    if ((host) == "") {
        return false;
    }
    if (((isAuthenticationNecessary) != "false") && ((login) == "")) {
        com.siemens.sw360.mail.MailUtil.log.error("Cannot send emails: authentication necessary, but login is not set.");
        return false;
    }
    return true;
}