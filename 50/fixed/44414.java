@java.lang.Override
public us.kbase.workspace.database.PermissionSet getPermissions(final us.kbase.workspace.database.WorkspaceUser user, final java.util.Set<us.kbase.workspace.database.ResolvedWorkspaceID> rwsis) throws us.kbase.workspace.database.exceptions.CorruptWorkspaceDBException, us.kbase.workspace.database.exceptions.WorkspaceCommunicationException {
    return getPermissions(user, rwsis, Permission.READ, false, false);
}