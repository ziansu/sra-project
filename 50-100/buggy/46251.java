@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    if ((newConfig.orientation) == (android.content.res.Configuration.ORIENTATION_LANDSCAPE)) {
        com.qsp.player.Utility.WriteLog("Config changed: landscape");
        hideTitle();
    }else
        if ((newConfig.orientation) == (android.content.res.Configuration.ORIENTATION_PORTRAIT)) {
            com.qsp.player.Utility.WriteLog("Config changed: portrait");
            showTitle();
        }
    
    if (gameIsRunning) {
        SetImageLimits();
        ApplyViewSettings();
        RefreshMainDesc();
        RefreshVarsDesc();
    }
    if (returnOrientation) {
        RotateClear(myActivity);
        returnOrientation = false;
    }
}