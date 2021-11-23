@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    if (key.equals(StartAtraceActivity.ICON_SHOW)) {
        com.jrdcom.systrace.service.AtraceService.sIconShowing = mCommandUtil.getBooleanState(key);
        com.jrdcom.systrace.toolbox.CommandUtil.myLogger(com.jrdcom.systrace.service.AtraceService.TAG, ("onSharedPreferenceChanged: sIconShowing=" + (com.jrdcom.systrace.service.AtraceService.sIconShowing)));
    }
}