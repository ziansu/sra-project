private boolean filterByUser(com.emc.storageos.db.client.model.AuditLog auditLog) {
    java.lang.String user = _request.getUser();
    return ((user != null) && (!(user.isEmpty()))) && (!(user.equalsIgnoreCase(auditLog.getUserId().toString())));
}