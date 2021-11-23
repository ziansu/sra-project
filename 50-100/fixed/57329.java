@android.annotation.SuppressLint(value = "CommitPrefEdits")
private void getPrefs() {
    java.lang.String defaultFocus = "0";
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(com.almalence.opencam.MainScreen.getMainContext());
    com.almalence.plugins.capture.night.NightCapturePlugin.FocusPreference = prefs.getString(com.almalence.plugins.capture.night.NightCapturePlugin.nightCaptureFocusPref, defaultFocus);
    if (!(usingSuperMode)) {
        if (Build.MODEL.contains("Nexus 6"))
            com.almalence.plugins.capture.night.NightCapturePlugin.OpenGLPreference = prefs.getBoolean(com.almalence.plugins.capture.night.NightCapturePlugin.nightVisionLayerShowPref, false);
        else
            com.almalence.plugins.capture.night.NightCapturePlugin.OpenGLPreference = prefs.getBoolean(com.almalence.plugins.capture.night.NightCapturePlugin.nightVisionLayerShowPref, true);
        
    }else
        com.almalence.plugins.capture.night.NightCapturePlugin.OpenGLPreference = false;
    
}