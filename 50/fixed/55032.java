public void setPathConfiguration() throws java.io.IOException {
    java.io.File pathConfigurationFile = new java.io.File(getJarFilePath(), com.compomics.software.settings.UtilitiesPathPreferences.configurationFileName);
    if (pathConfigurationFile.exists()) {
        eu.isas.searchgui.preferences.SearchGUIPathPreferences.loadPathPreferencesFromFile(pathConfigurationFile);
    }
}