@java.lang.Override
public void onError(java.lang.Throwable t) {
    mainActivity.getActivityHelper().closeLoadingBar();
    android.util.Log.e(Constants.TAG, "Error Saving order to the server.");
}