private static synchronized void loadGlobalSettings() throws java.io.IOException {
    java.io.File confFile = ovt.Utils.findFile(((ovt.OVTCore.getConfDir()) + (ovt.OVTCore.globalSettingsFileName)));
    try (java.io.FileInputStream in = new java.io.FileInputStream(confFile)) {
        ovt.OVTCore.globalProperties.load(in);
    }
}