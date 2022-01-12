@java.lang.Override
protected void afterHookedMethod(nz.pbomb.xposed.anzmods.MethodHookParam param) throws java.lang.Throwable {
    nz.pbomb.xposed.anzmods.XposedMod.refreshSharedPreferences();
    android.util.Log.e("SuperKiwi", ("afterHookedMethod: " + (java.lang.String.valueOf(nz.pbomb.xposed.anzmods.XposedMod.prefs.getBoolean(PREFERENCES.KEYS.ANZ.SPOOF_DEVICE, PREFERENCES.DEFAULT_VALUES.ANZ.SPOOF_DEVICE)))));
    if (nz.pbomb.xposed.anzmods.XposedMod.prefs.getBoolean(PREFERENCES.KEYS.ANZ.SPOOF_DEVICE, PREFERENCES.DEFAULT_VALUES.ANZ.SPOOF_DEVICE)) {
        param.args[0] = deviceInfo.Build.FINGERPRINT;
        super.afterHookedMethod(param);
    }
}