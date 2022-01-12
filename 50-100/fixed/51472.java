private com.espirit.moddev.cli.results.SimpleResult<java.lang.Boolean> installModule(de.espirit.firstspirit.access.Connection connection) {
    com.espirit.moddev.moduleinstaller.ModuleInstallationParametersBuilder parameterBuilder = new com.espirit.moddev.moduleinstaller.ModuleInstallationParametersBuilder();
    parameterBuilder.setFirstSpiritModule(fsm).setProjectAppConfigurationFile(projectAppConfigurationFile).setProjectName(projectName).setServiceConfigurationFiles(serviceConfigurationsFiles).setWebAppConfigurationFiles(webAppConfigurationFiles).setWebAppScopes(webAppScopes);
    final com.espirit.moddev.moduleinstaller.ModuleInstallationParameters parameters = parameterBuilder.build();
    boolean installed = new com.espirit.moddev.moduleinstaller.ModuleInstaller().install(connection, parameters);
    return new com.espirit.moddev.cli.results.SimpleResult(installed);
}