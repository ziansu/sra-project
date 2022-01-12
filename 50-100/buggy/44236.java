@java.lang.Override
protected void afterHookedMethod(pk.qwerty12.nfclockscreenoffenabler.MethodHookParam param) throws java.lang.Throwable {
    java.lang.String fieldName;
    if (currentapiVersion < (android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)) {
        fieldName = "mKeyguardScreenCallback";
    }else {
        fieldName = "mCallback";
    }
    try {
        pk.qwerty12.nfclockscreenoffenabler.NFCLockScreenOffEnabler.mKeyguardSecurityCallbackInstance = de.robv.android.xposed.XposedHelpers.getObjectField(param.thisObject, fieldName);
    } catch (java.lang.NoSuchFieldError e) {
    }
    android.content.Context context = ((android.content.Context) (param.args[0]));
    registerNfcUnlockReceivers(context);
}