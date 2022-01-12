public fi.otavanopisto.muikku.schooldata.entity.WorkspaceType findWorkspaceType(fi.otavanopisto.muikku.schooldata.SchoolDataIdentifier identifier) {
    if (identifier == null) {
        return null;
    }
    return workspaceSchoolDataController.findWorkspaceTypeByDataSourceAndIdentifier(identifier.getDataSource(), identifier.getIdentifier());
}