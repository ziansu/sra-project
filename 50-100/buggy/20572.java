public java.lang.String getBundleUrl(java.lang.String defaultAssetsUrl) {
    java.lang.String currentVersion = getCurrentVersion();
    if (currentVersion == null) {
        return defaultAssetsUrl;
    }
    if (!(sp.getBoolean("firstTime", false))) {
        if (!(sp.getBoolean("firstTimeOk", true))) {
            currentVersion = this.rollBack();
        }
    }
    return new java.io.File(rootDir, (currentVersion + "/index.bundlejs")).toString();
}