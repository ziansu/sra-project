@java.lang.Override
public void onActivityPaused(android.app.Activity activity) {
    if (activity != (mActivity)) {
        return ;
    }
    com.rust.webvr.OVRService.nativeOnPause(mPtr);
}