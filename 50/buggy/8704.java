public void addAuthenticationLogEntry(java.lang.String username, boolean status, java.lang.String message) {
    db.addLoginEntry(new postit.shared.AuditLog.LogEntry(java.lang.System.currentTimeMillis(), EventType.AUTHENTICATE, username, status, message));
}