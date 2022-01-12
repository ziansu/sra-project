public static boolean isRefreshGradesService() {
    if ((fr.clementduployez.aurionexplorer.Utils.UserData.refreshGradesService) == null) {
        fr.clementduployez.aurionexplorer.Utils.UserData.refreshGradesService = fr.clementduployez.aurionexplorer.Utils.UserData.loadPreferences().getBoolean(fr.clementduployez.aurionexplorer.Utils.UserData.REFRESH_GRADES_SERVICE_KEY, false);
    }
    return fr.clementduployez.aurionexplorer.Utils.UserData.refreshGradesService;
}