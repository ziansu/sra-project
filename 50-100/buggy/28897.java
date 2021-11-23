@java.lang.Override
protected void afterHookedMethod(pk.qwerty12.nfclockscreenoffenabler.MethodHookParam param) throws java.lang.Throwable {
    try {
        pk.qwerty12.nfclockscreenoffenabler.NFCLockScreenOffEnabler.mKeyguardSecurityCallbackInstance = de.robv.android.xposed.XposedHelpers.getObjectField(param.thisObject, "mSecurityCallback");
    } catch (java.lang.NoSuchFieldError e) {
        try {
            pk.qwerty12.nfclockscreenoffenabler.NFCLockScreenOffEnabler.mKeyguardSecurityCallbackInstance = de.robv.android.xposed.XposedHelpers.getObjectField(param.thisObject, "mCallback");
        } catch (java.lang.NoSuchFieldError e1) {
            de.robv.android.xposed.XposedBridge.log("All attempts to get callback failed");
        }
    }
    android.content.Context context = ((android.content.Context) (param.args[0]));
    registerNfcUnlockReceivers(context);
}