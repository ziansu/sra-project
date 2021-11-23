@java.lang.Override
public boolean isNewer(java.lang.String currentVersion, java.lang.String checkVersion) {
    long currentVersionLong = de.robotricker.transportpipes.update.UpdateManager.convertVersionToLong(currentVersion);
    long checkVersionLong = de.robotricker.transportpipes.update.UpdateManager.convertVersionToLong(checkVersion);
    return checkVersionLong > currentVersionLong;
}