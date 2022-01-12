@java.lang.Override
protected void beforeHookedMethod(com.woalk.apps.xposed.htcblinkfeedauthorizer.MethodHookParam param) throws java.lang.Throwable {
    param.args[4] = false;
    com.woalk.apps.xposed.htcblinkfeedauthorizer.Logger.logHookAfter(param);
}