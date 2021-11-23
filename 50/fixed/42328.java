@java.lang.Override
public void onError(java.lang.Throwable e) {
    this.hideViewLoading();
    this.showErrorMessage(new org.mythtv.android.domain.exception.DefaultErrorBundle(new java.lang.Exception(e)));
    this.showViewRetry();
}