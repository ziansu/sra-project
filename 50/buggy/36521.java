@java.lang.Override
public us.kbase.workspace.database.PermissionSet getPermissions(final us.kbase.workspace.database.WorkspaceUser user, final us.kbase.workspace.database.Permission perm, final boolean excludeGlobalRead) throws us.kbase.workspace.database.exceptions.CorruptWorkspaceDBException, us.kbase.workspace.database.exceptions.WorkspaceCommunicationException {
    return getPermissions(user, new java.util.HashSet<us.kbase.workspace.database.ResolvedWorkspaceID>(), perm, excludeGlobalRead);
}