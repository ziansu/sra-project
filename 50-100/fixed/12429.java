public static synchronized void saveGlobalSettings() throws java.io.IOException {
    java.io.File confFile = ovt.Utils.findFile(((ovt.OVTCore.getConfDir()) + (ovt.OVTCore.globalSettingsFileName)));
    if (confFile != null) {
        try (java.io.FileOutputStream out = new java.io.FileOutputStream(confFile)) {
            ovt.OVTCore.globalProperties.save(out, "OVT properties file.");
        }
    }
}