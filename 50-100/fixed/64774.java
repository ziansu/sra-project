private void wrapIntent(android.content.Intent intent) {
    java.lang.String realClazz = intent.getComponent().getClassName();
    if ((net.wequick.small.ApkBundleLauncher.sLoadedActivities) == null)
        return ;
    
    android.content.pm.ActivityInfo ai = net.wequick.small.ApkBundleLauncher.sLoadedActivities.get(realClazz);
    if (ai == null)
        return ;
    
    intent.addCategory(((net.wequick.small.ApkBundleLauncher.InstrumentationWrapper.REDIRECT_FLAG) + realClazz));
    java.lang.String stubClazz = dequeueStubActivity(ai, realClazz);
    intent.setComponent(new android.content.ComponentName(net.wequick.small.Small.getContext(), stubClazz));
}