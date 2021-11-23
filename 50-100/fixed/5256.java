private void activateProject(java.lang.String projectName, de.espirit.firstspirit.access.project.Project project) {
    if (project == null) {
        throw new java.lang.IllegalArgumentException("Project for activation is null");
    }
    if (!(project.isActive())) {
        com.espirit.moddev.cli.CliContextImpl.LOGGER.warn("Project '{}' is not active! Try to activate...", projectName);
        de.espirit.firstspirit.access.UserService userService = project.getUserService();
        de.espirit.firstspirit.access.AdminService adminService = userService.getConnection().getService(de.espirit.firstspirit.access.AdminService.class);
        adminService.getProjectStorage().activateProject(project);
    }else {
        com.espirit.moddev.cli.CliContextImpl.LOGGER.debug("Project '{}' is already active! No need to activate...", projectName);
    }
}