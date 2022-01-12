public com.espirit.moddev.moduleinstaller.ModuleInstallationParameters build() {
    return new com.espirit.moddev.moduleinstaller.ModuleInstallationParameters(projectName, fsm, configurationFileForServiceName, projectAppConfigurationFile, splittedWebAppScopes, webAppConfigurationFilesForWebScopes);
}