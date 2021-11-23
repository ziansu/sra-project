private void validateBeforeSaving(org.jboss.pnc.rest.restmodel.ProjectRest projectRest) throws org.jboss.pnc.rest.provider.ConflictedEntryException {
    org.jboss.pnc.model.Project project = projectRepository.queryByPredicates(org.jboss.pnc.spi.datastore.predicates.ProjectPredicates.withProjectName(projectRest.getName()));
    if ((project != null) && (!(project.getId().equals(projectRest.getId())))) {
        throw new org.jboss.pnc.rest.provider.ConflictedEntryException("Project of that name already exists", org.jboss.pnc.model.Project.class, project.getId());
    }
}