@java.lang.Override
public boolean isAuthorized(java.lang.String userId, org.kuali.kra.irb.auth.ProtocolTask task) {
    return ((!(task.getProtocol().isNew())) || (!(canExecuteAction(task.getProtocol(), ProtocolActionType.GRANT_EXEMPTION)))) && (hasPermission(userId, task.getProtocol(), PermissionConstants.MAINTAIN_PROTOCOL_SUBMISSIONS));
}