public boolean isWorkFlowManager() {
    try {
        edu.stanford.protege.metaproject.api.Role wfm = ((org.protege.editor.owl.client.LocalHttpClient) (clientSession.getActiveClient())).getRole(new edu.stanford.protege.metaproject.impl.RoleIdImpl("mp-project-manager"));
        return clientSession.getActiveClient().getActiveRoles().contains(wfm);
    } catch (org.protege.editor.owl.client.api.exception.ClientRequestException e) {
        e.printStackTrace();
    }
    return false;
}