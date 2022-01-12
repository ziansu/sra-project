@java.lang.Override
public com.vaadin.server.SystemMessages getSystemMessages(com.vaadin.server.SystemMessagesInfo systemMessagesInfo) {
    com.vaadin.server.CustomizedSystemMessages messages = new com.vaadin.server.CustomizedSystemMessages();
    try {
        java.lang.String problemRedirectURL = RepositoryPropertyKey.BaseURL.getValue(RepositoryPropertyKey.BaseURL.getDefaultValue());
        messages.setAuthenticationErrorURL(problemRedirectURL);
        messages.setInternalErrorURL(problemRedirectURL);
        messages.setSessionExpiredURL(problemRedirectURL);
        messages.setCommunicationErrorURL(problemRedirectURL);
        messages.setCookiesDisabledURL(problemRedirectURL);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return messages;
}