public java.util.List<fi.muikku.plugins.workspace.model.WorkspaceJournalEntry> getJournalEntries() {
    fi.muikku.model.workspace.WorkspaceEntity workspaceEntity = workspaceController.findWorkspaceEntityById(workspaceEntityId);
    fi.muikku.model.users.UserEntity userEntity = sessionController.getLoggedUserEntity();
    if (sessionController.hasCoursePermission(MuikkuPermissions.LIST_ALL_JOURNAL_ENTRIES, workspaceEntity)) {
        return workspaceJournalController.listEntries(workspaceController.findWorkspaceEntityById(workspaceEntityId));
    }else {
        return workspaceJournalController.listEntriesByWorkspaceEntityAndUserEntity(workspaceEntity, userEntity);
    }
}