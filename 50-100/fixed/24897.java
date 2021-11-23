private static void init(android.content.Context context, android.app.Activity activity) {
    if (org.xwalk.core.internal.XWalkViewInternal.sInitialized)
        return ;
    
    org.xwalk.core.internal.XWalkViewDelegate.init(null, activity);
    org.chromium.base.ApplicationStatusManager.init(activity.getApplication());
    org.chromium.base.ApplicationStatusManager.informActivityStarted(activity);
    org.xwalk.core.internal.XWalkViewInternal.sInitialized = true;
}