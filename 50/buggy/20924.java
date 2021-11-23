public fi.otavanopisto.muikku.schooldata.entity.WorkspaceType findWorkspaceType(fi.otavanopisto.muikku.schooldata.SchoolDataIdentifier identifier) {
    return workspaceSchoolDataController.findWorkspaceTypeByDataSourceAndIdentifier(identifier.getDataSource(), identifier.getIdentifier());
}