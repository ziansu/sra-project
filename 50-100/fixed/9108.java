private boolean isMailingEnabledAndValid() {
    if ("".equals(host)) {
        return false;
    }
    if ((!("false".equals(isAuthenticationNecessary))) && ("".equals(login))) {
        com.siemens.sw360.mail.MailUtil.log.error("Cannot send emails: authentication necessary, but login is not set.");
        return false;
    }
    return true;
}