@java.lang.Override
public void onError(java.lang.Throwable e) {
    if (name.gudong.translate.BuildConfig.DEBUG) {
        e.printStackTrace();
    }
    if ((mView) != null) {
        mView.onError(e);
    }
}