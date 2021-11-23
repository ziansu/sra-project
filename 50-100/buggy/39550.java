private static android.app.Activity getActivityFormObject(java.lang.Object object) {
    android.app.Activity activity = null;
    if (object instanceof android.app.Activity) {
        activity = ((android.app.Activity) (object));
    }else
        if (object instanceof android.support.v4.app.Fragment) {
            activity = ((android.support.v4.app.Fragment) (object)).getActivity();
        }else
            if (object instanceof android.support.v4.app.Fragment) {
                activity = ((android.support.v4.app.Fragment) (object)).getActivity();
            }
        
    
    com.qiyei.sdk.log.LogManager.i(PermissionConstant.TAG, ("getActivityFormObject(),activity is :" + activity));
    return activity;
}