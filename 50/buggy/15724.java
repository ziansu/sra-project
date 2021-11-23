@java.lang.Override
public rx.Observer<java.lang.String> showProgress(java.lang.String loadingMessage, boolean shouldHideProgress) {
    if ((this.baseActivity) != null) {
        this.baseActivity.showProgress(loadingMessage, shouldHideProgress);
    }
    return null;
}