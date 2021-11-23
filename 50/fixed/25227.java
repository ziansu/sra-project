@java.lang.Override
public void onFailure(java.lang.Throwable throwable) {
    callbacks.onArticlesLoadError(new com.desk.android.sdk.error.ErrorResponse(throwable));
}