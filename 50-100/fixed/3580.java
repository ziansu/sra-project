private void preventCheckFromMockProvider(final de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam lpparam) {
    if ((Build.VERSION.SDK_INT) >= 18) {
        de.robv.android.xposed.XposedHelpers.findAndHookMethod(android.location.Location.class, "isFromMockProvider", new de.robv.android.xposed.XC_MethodHook() {
            @java.lang.Override
            protected void beforeHookedMethod(com.github.jinsen47.pokefaker.MethodHookParam param) throws java.lang.Throwable {
                de.robv.android.xposed.XposedHelpers.setBooleanField(param.thisObject, "mIsFromMockProvider", false);
                android.util.Log.d(com.github.jinsen47.pokefaker.MockProviderFaker.TAG, ((param.thisObject.getClass().getName()) + "is calling from mock provider"));
                param.setResult(false);
            }
        });
    }
}