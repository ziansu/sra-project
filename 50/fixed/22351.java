@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB_MR2)
private static void setAndroidThemeAccordingly13(android.app.Activity activity) {
    if (br.com.carlosrafaelgn.fplay.ui.UI.isAndroidThemeLight())
        activity.setTheme(android.R.style.Theme_Holo_Light_NoActionBar_Fullscreen);
    else
        activity.setTheme(android.R.style.Theme_Holo_NoActionBar_Fullscreen);
    
}