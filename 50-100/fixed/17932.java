@java.lang.Override
protected void afterHookedMethod(nz.pbomb.xposed.anzmods.MethodHookParam param) throws java.lang.Throwable {
    nz.pbomb.xposed.anzmods.XposedMod.refreshSharedPreferences();
    if (nz.pbomb.xposed.anzmods.XposedMod.prefs.getBoolean(PREFERENCES.KEYS.ANZ.SPOOF_DEVICE, PREFERENCES.DEFAULT_VALUES.ANZ.SPOOF_DEVICE)) {
        param.args[0] = java.lang.Integer.valueOf(deviceInfo.VERSION.SDK_INT);
        super.afterHookedMethod(param);
    }
}