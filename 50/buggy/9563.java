public synchronized void reportError(java.lang.Throwable t) {
    reportNote(t.getMessage());
    m_loadFailure = true;
    stop();
}