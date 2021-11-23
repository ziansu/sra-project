java.lang.String getAndLogTokenHandlerProperty(java.lang.String property) {
    if (property == null) {
        return null;
    }
    if ((tokenHandlerProp.getProperty(property)) == null) {
        return null;
    }
    return tokenHandlerProp.getProperty(property).trim();
}