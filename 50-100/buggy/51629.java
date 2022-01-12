@java.lang.Override
protected boolean pollDirectory(java.lang.String fileName, java.util.List list, int depth) {
    org.apache.camel.Component component = endpoint.getComponent();
    java.lang.String remaining;
    if (component != null) {
        remaining = ((org.codice.ddf.catalog.content.monitor.DurableFileComponent) (component)).remaining;
        if (remaining != null) {
            java.lang.String sha1 = org.apache.commons.codec.digest.DigestUtils.sha1Hex(remaining);
            initialize(remaining, sha1);
            return doPoll(sha1);
        }
    }
    return false;
}