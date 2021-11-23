protected void logMessage(java.lang.String key, java.util.Map<java.lang.String, java.lang.Object> variables, org.wicketstuff.security.log.IAuthorizationMessageSource message) {
    java.lang.String msg = message.getMessage(key);
    if (!(org.apache.wicket.util.string.Strings.isEmpty(msg)))
        org.wicketstuff.security.strategies.WaspAuthorizationStrategy.log.debug(message.substitute(msg, variables));
    
}