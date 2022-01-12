private static java.lang.String getTWSSettingsDirectory() {
    return ibcontroller.Settings.settings().getString("IbDir", java.lang.System.getProperty("user.dir"));
}