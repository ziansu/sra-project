public io.cattle.platform.core.model.Account createProjectForUser(io.cattle.platform.core.model.Account account) {
    io.cattle.platform.core.model.Account project = authDao.createProject(((account.getName()) + (io.cattle.platform.core.constants.ProjectConstants.PROJECT_DEFAULT_NAME)), null);
    io.cattle.platform.api.auth.Identity identity = new io.cattle.platform.api.auth.Identity(account.getExternalIdType(), account.getExternalId());
    authDao.createProjectMember(project, new io.cattle.platform.iaas.api.auth.projects.Member(identity, io.cattle.platform.core.constants.ProjectConstants.OWNER));
    return project;
}