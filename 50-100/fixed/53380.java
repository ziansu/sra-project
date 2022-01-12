private static stew5.Password createPasswordInstance(java.lang.String className) {
    if ((className != null) && (!(className.isEmpty()))) {
        try {
            return ((stew5.Password) (stew5.DynamicLoader.newInstance(className)));
        } catch (java.lang.Exception ex) {
            stew5.Connector.log.warn(ex);
        }
    }
    return new stew5.PlainTextPassword();
}