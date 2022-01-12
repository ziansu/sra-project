@com.google.common.annotations.VisibleForTesting
static java.lang.Integer getLineId(com.puppycrawl.tools.checkstyle.api.AuditEvent event) {
    java.lang.Integer result = null;
    try {
        int line = event.getLine();
        if (line != 0) {
            result = line;
        }
    } catch (java.lang.Exception e) {
    }
    return result;
}