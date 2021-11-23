@java.lang.Override
public void onError(java.lang.Throwable t) {
    android.util.Log.e(Constants.TAG, "Error Saving order to the server.");
    mainActivity.getActivityHelper().closeLoadingBar();
}