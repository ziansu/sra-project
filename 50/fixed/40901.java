java.lang.String getProcessedBody(com.groupeseb.kite.CreationLog creationLog) {
    if ((getBody()) == null) {
        return "";
    }
    return creationLog.processPlaceholders(getName(), getBody().toString(), true);
}