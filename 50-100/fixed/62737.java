@java.lang.Override
public org.eclipse.che.api.workspace.server.model.impl.WorkspaceImpl create(org.eclipse.che.api.workspace.server.model.impl.WorkspaceImpl workspace) throws org.eclipse.che.api.core.ConflictException, org.eclipse.che.api.core.ServerException {
    java.util.Objects.requireNonNull(workspace, "Required non-null workspace");
    try {
        doCreate(workspace);
    } catch (org.eclipse.che.api.core.jdbc.jpa.DuplicateKeyException dkEx) {
        throw new org.eclipse.che.api.core.ConflictException(java.lang.String.format("Workspace with id '%s' or name '%s' in namespace '%s' already exists", workspace.getId(), workspace.getName(), workspace.getNamespace()));
    } catch (java.lang.RuntimeException x) {
        throw new org.eclipse.che.api.core.ServerException(x.getMessage(), x);
    }
    return workspace;
}