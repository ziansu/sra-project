public com.googlecode.cchlib.apps.duplicatefiles.ConfigMode getConfigMode() {
    com.googlecode.cchlib.apps.duplicatefiles.ConfigMode configMode = preferences.getConfigMode();
    if (configMode == null) {
        configMode = com.googlecode.cchlib.apps.duplicatefiles.ConfigMode.BEGINNER;
        preferences.setConfigMode(configMode);
    }
    return configMode;
}