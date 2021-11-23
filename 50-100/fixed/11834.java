public org.exist.security.Subject popSubject() {
    if (org.exist.storage.DBBroker.LOG.isTraceEnabled()) {
        org.exist.storage.DBBroker.LOG.trace(java.lang.String.format("%s: popSubject(%s) from: %s %s", getId(), getCurrentSubject().getName(), java.lang.Thread.currentThread(), org.exist.util.Stacktrace.top(java.lang.Thread.currentThread().getStackTrace(), 10)));
    }
    return this.subject.removeFirst();
}