private static synchronized void loadGlobalSettings() throws java.io.IOException {
    java.io.File confFile = ovt.Utils.findFile(((ovt.OVTCore.getConfDir()) + (ovt.OVTCore.globalSettingsFileName)));
    if (confFile == null) {
        throw new java.io.IOException("Can not find a global settings file to read.");
    }
    try (java.io.FileInputStream in = new java.io.FileInputStream(confFile)) {
        ovt.OVTCore.globalProperties.load(in);
    }
}