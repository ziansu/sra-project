@java.lang.Override
protected void beforeHookedMethod(com.woalk.apps.xposed.htcblinkfeedauthorizer.MethodHookParam param) throws java.lang.Throwable {
    com.woalk.apps.xposed.htcblinkfeedauthorizer.Logger.d("X_Mod: Hook called to replace systemwide");
    mSettings.loadCachePrefs();
    com.woalk.apps.xposed.htcblinkfeedauthorizer.X_Mod.replaceSystemWideThemes();
    com.woalk.apps.xposed.htcblinkfeedauthorizer.Logger.logHookAfter(param);
}