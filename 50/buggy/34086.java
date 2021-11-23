@java.lang.Override
protected void afterHookedMethod(nz.pbomb.xposed.anzmods.MethodHookParam param) throws java.lang.Throwable {
    if (nz.pbomb.xposed.anzmods.XposedMod.prefs.getBoolean(PREFERENCES.KEYS.ANZ.SPOOF_DEVICE, PREFERENCES.DEFAULT_VALUES.ANZ.SPOOF_DEVICE)) {
        de.robv.android.xposed.XposedHelpers.callMethod(param.thisObject, "b04160416041604160416ЖЖ0416", new java.lang.Class<?>[]{ java.lang.String.class }, deviceInfo.Build.BOARD);
    }
}