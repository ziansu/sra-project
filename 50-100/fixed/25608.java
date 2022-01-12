public boolean queryProjectPolicy(org.protege.editor.owl.client.UserId userId, org.protege.editor.owl.client.ProjectId projectId, org.protege.editor.owl.client.OperationId operationId) {
    boolean isAllowed = false;
    try {
        connect();
        isAllowed = server.isOperationAllowed(authToken, operationId, projectId, userId);
    } catch (org.protege.editor.owl.server.api.exception.AuthorizationException | org.protege.editor.owl.server.api.exception.ServerServiceException | java.rmi.RemoteException e) {
    }
    return isAllowed;
}