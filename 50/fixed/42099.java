public com.googlecode.cchlib.apps.duplicatefiles.ConfigMode getConfigMode() {
    com.googlecode.cchlib.apps.duplicatefiles.ConfigMode configMode = this.preferences.getConfigMode();
    if (configMode == null) {
        configMode = com.googlecode.cchlib.apps.duplicatefiles.ConfigMode.BEGINNER;
        this.preferences.setConfigMode(configMode);
    }
    return configMode;
}