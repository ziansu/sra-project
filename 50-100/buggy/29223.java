public fi.muikku.model.workspace.WorkspaceUserEntity findWorkspaceUserByWorkspaceEntityAndUserIdentifierAndArchived(fi.muikku.model.workspace.WorkspaceEntity workspaceEntity, fi.muikku.schooldata.SchoolDataIdentifier userIdentifier, java.lang.Boolean archived) {
    fi.muikku.model.users.UserSchoolDataIdentifier userSchoolDataIdentifier = userSchoolDataIdentifierController.findUserSchoolDataIdentifierByDataSourceAndIdentifier(userIdentifier.getDataSource(), userIdentifier.getIdentifier());
    if (userSchoolDataIdentifier == null) {
        return null;
    }
    return workspaceUserEntityDAO.findByWorkspaceEntityAndUserSchoolDataIdentifierAndArchived(workspaceEntity, userSchoolDataIdentifier, archived);
}