@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.reactnativenavigation.activities.BaseReactActivity activity = com.reactnativenavigation.utils.ContextProvider.getActivityContext();
    if ((((mReactInstanceManager) != null) && (activity != null)) && (activity.isFinishing())) {
        android.util.Log.i(com.reactnativenavigation.activities.BaseReactActivity.TAG, "Destroying ReactInstanceManager");
        mReactInstanceManager.onDestroy();
    }else {
        android.util.Log.d(com.reactnativenavigation.activities.BaseReactActivity.TAG, "Not destroying ReactInstanceManager");
    }
}