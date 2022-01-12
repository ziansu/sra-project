private static synchronized void loadGlobalSettings() throws java.io.IOException {
    java.io.File confFile = ovt.Utils.findFile(((ovt.OVTCore.getConfDir()) + (ovt.OVTCore.globalSettingsFileName)));
    if (confFile != null) {
        try (java.io.FileInputStream in = new java.io.FileInputStream(confFile)) {
            if (confFile != null) {
                ovt.OVTCore.globalProperties.load(in);
            }
        }
    }
}