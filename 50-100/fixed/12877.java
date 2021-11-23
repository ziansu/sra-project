@java.lang.Override
protected void beforeHookedMethod(com.woalk.apps.xposed.notifcount.MethodHookParam param) throws java.lang.Throwable {
    android.service.notification.StatusBarNotification sbn = ((android.service.notification.StatusBarNotification) (param.args[0]));
    com.woalk.apps.xposed.notifcount.XposedMod.mSettingsHelper.reload();
    com.woalk.apps.xposed.notifcount.XposedMod.autoApplyNumber(sbn.getNotification(), com.woalk.apps.xposed.notifcount.XposedMod.mSettingsHelper.getSetting(sbn.getPackageName()));
}