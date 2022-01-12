public java.util.List<org.springframework.boot.actuate.audit.AuditEvent> convertToAuditEvent(java.lang.Iterable<PersistentAuditEvent> persistentAuditEvents) {
    if (persistentAuditEvents == null) {
        return java.util.Collections.emptyList();
    }
    java.util.List<org.springframework.boot.actuate.audit.AuditEvent> auditEvents = new java.util.ArrayList<>();
    for (PersistentAuditEvent persistentAuditEvent : persistentAuditEvents) {
        org.springframework.boot.actuate.audit.AuditEvent auditEvent = new org.springframework.boot.actuate.audit.AuditEvent(persistentAuditEvent.getAuditEventDate().toDate(), persistentAuditEvent.getPrincipal(), persistentAuditEvent.getAuditEventType(), convertDataToObjects(persistentAuditEvent.getData()));
        auditEvents.add(auditEvent);
    }
    return auditEvents;
}