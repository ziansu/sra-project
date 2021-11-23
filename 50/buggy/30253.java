private static java.lang.String getTWSSettingsDirectory() {
    java.lang.String dir = ibcontroller.Settings.settings().getString("IbDir", java.lang.System.getProperty("user.dir"));
    ibcontroller.Utils.logToConsole(("TWS settings directory is " + dir));
    return dir;
}