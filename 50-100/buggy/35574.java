private void initialize(java.util.ArrayList<java.lang.String> configuredServers) {
    listUserSettings = new java.util.ArrayList<ch.ethz.scu.obit.common.settings.UserSettings>();
    for (int i = 0; i < (configuredServers.size()); i++) {
        listUserSettings.add(new ch.ethz.scu.obit.common.settings.UserSettings());
    }
    favoriteServerSettingsIndex = 0;
    currentServerSettingsIndex = 0;
}