@java.lang.Override
public org.eclipse.che.api.workspace.server.model.impl.WorkspaceImpl update(org.eclipse.che.api.workspace.server.model.impl.WorkspaceImpl update) throws org.eclipse.che.api.core.ConflictException, org.eclipse.che.api.core.NotFoundException, org.eclipse.che.api.core.ServerException {
    java.util.Objects.requireNonNull(update, "Required non-null update");
    try {
        return doUpdate(update);
    } catch (org.eclipse.che.api.core.jdbc.jpa.DuplicateKeyException dkEx) {
        throw new org.eclipse.che.api.core.ConflictException(java.lang.String.format("Workspace with name '%s' in namespace '%s' already exists", update.getName(), update.getNamespace()));
    } catch (java.lang.RuntimeException x) {
        throw new org.eclipse.che.api.core.ServerException(x.getMessage(), x);
    }
}