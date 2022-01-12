public io.cattle.platform.core.model.Account createProjectForUser(io.cattle.platform.api.auth.Identity identity) {
    io.cattle.platform.core.model.Account project = authDao.createProject(((identity.getName()) + (io.cattle.platform.core.constants.ProjectConstants.PROJECT_DEFAULT_NAME)), null);
    authDao.createProjectMember(project, new io.cattle.platform.iaas.api.auth.projects.Member(identity, io.cattle.platform.core.constants.ProjectConstants.OWNER));
    return project;
}