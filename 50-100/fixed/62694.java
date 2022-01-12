private java.lang.String processW4Action(java.util.Map<java.lang.String, java.lang.Object> properties, java.util.Map<java.lang.String, java.lang.Object> dataEntries) {
    java.security.Principal principal = login();
    long timeBefore = java.lang.System.currentTimeMillis();
    java.lang.String returnedMessage = doProcessW4Action(principal, properties, dataEntries);
    if (logger.isDebugEnabled()) {
        logger.debug((("Message processed in " + ((java.lang.System.currentTimeMillis()) - timeBefore)) + "ms"));
    }
    logout(principal);
    return returnedMessage;
}