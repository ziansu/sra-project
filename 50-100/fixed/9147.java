@java.lang.Override
protected void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam param) throws java.lang.Throwable {
    android.content.BroadcastReceiver broad = ((android.content.BroadcastReceiver) (param.args[0]));
    if (broad != null)
        handleBroad(broad);
    
    android.content.IntentFilter filter = ((android.content.IntentFilter) (param.args[1]));
    if (filter != null)
        handleFilter(filter);
    
}