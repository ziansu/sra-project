public fi.otavanopisto.muikku.schooldata.entity.WorkspaceType createEntity(fi.pyramus.rest.model.CourseType courseType) {
    return new fi.otavanopisto.muikku.plugins.schooldatapyramus.entities.PyramusWorkspaceType(identifierMapper.getWorkspaceTypeIdentifier(courseType.getId()), courseType.getName());
}