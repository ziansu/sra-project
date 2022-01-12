private boolean isEmulatorUpdateToDate() throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String currentVersion = installedEmulatorVersion(versionPrefix);
    return (currentVersion != null) && ((currentVersion.compareTo(minVersion)) >= 0);
}