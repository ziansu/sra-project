private boolean filterByUser(com.emc.storageos.db.client.model.AuditLog auditLog) {
    java.lang.String user = _request.getUser();
    if ((user == null) || (user.isEmpty()))
        return false;
    
    if ((auditLog.getUserId()) != null) {
        return !(user.equalsIgnoreCase(auditLog.getUserId().toString()));
    }
    return true;
}