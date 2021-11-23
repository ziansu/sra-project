@java.lang.Override
public void onStart() {
    super.onStart();
    if (showLoadingDailog) {
        loadingCallback.onStartLoading(loadingMsg);
    }
}