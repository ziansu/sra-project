@com.google.common.annotations.VisibleForTesting
static java.lang.Integer getLineId(com.puppycrawl.tools.checkstyle.api.AuditEvent event) {
    try {
        int line = event.getLine();
        return line == 0 ? null : line;
    } catch (java.lang.Exception e) {
        return null;
    }
}