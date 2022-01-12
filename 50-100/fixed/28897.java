@java.lang.Override
protected void afterHookedMethod(pk.qwerty12.nfclockscreenoffenabler.MethodHookParam param) throws java.lang.Throwable {
    try {
        pk.qwerty12.nfclockscreenoffenabler.NFCLockScreenOffEnabler.mKeyguardSecurityCallbackInstance = de.robv.android.xposed.XposedHelpers.getObjectField(param.thisObject, "mCallback");
    } catch (java.lang.NoSuchFieldError e) {
    }
    android.content.Context context = ((android.content.Context) (param.args[0]));
    registerNfcUnlockReceivers(context);
}