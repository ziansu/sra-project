public static void main(java.lang.String[] args) {
    if ((args.length) > 0) {
        ru.mrekin.sc.launcher.tools.ApplicationTools.execute(args);
    }else {
        ru.mrekin.sc.launcher.core.SettingsManager.updateLocalSettings();
        ru.mrekin.sc.launcher.core.AppManager.getInstance();
        if ("true".equals(ru.mrekin.sc.launcher.core.SettingsManager.getPropertyByName(LauncherConstants.AutoUpdaterEnabled, "true"))) {
            java.lang.String version = ru.mrekin.sc.launcher.update.AutoUpdater.checkForUpdates();
            if (version != null) {
                ru.mrekin.sc.launcher.update.AutoUpdater.update(version);
            }
        }
        ru.mrekin.sc.launcher.gui.LauncherGui gui = new ru.mrekin.sc.launcher.gui.LauncherGui();
    }
}