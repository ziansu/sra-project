@java.lang.Override
protected void beforeHookedMethod(com.woalk.apps.xposed.htcblinkfeedauthorizer.MethodHookParam param) throws java.lang.Throwable {
    mSettings.loadCachePrefs();
    com.woalk.apps.xposed.htcblinkfeedauthorizer.X_Mod.replaceSystemWideThemes();
    com.woalk.apps.xposed.htcblinkfeedauthorizer.Logger.logHookAfter(param);
}