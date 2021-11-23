@java.lang.Override
public void onReceiveVersion(java.lang.String serverVersion) {
    if (!(nl.hnogames.domoticz.Utils.UsefulBits.isEmpty(serverVersion))) {
        java.lang.String[] version = serverVersion.split("\\.");
        java.lang.String updateVersion = ((version[0]) + ".") + (mSharedPrefs.getUpdateVersionAvailable());
    }
}