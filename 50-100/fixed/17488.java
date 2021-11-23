protected void beforeHookedMethod(mobi.acpm.inspeckage.hooks.MethodHookParam param) throws java.lang.Throwable {
    android.content.Intent intent = ((android.content.Intent) (param.args[0]));
    if ((intent != null) && (!(intent.getAction().contains("mobi.acpm.inspeckage")))) {
        de.robv.android.xposed.XposedBridge.log((((mobi.acpm.inspeckage.hooks.IPCHook.TAG) + "sendBroadcast: ") + intent));
    }
}