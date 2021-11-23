@java.lang.Override
void onError(java.lang.Throwable e) {
    android.util.Log.e(com.spartahack.spartahack17.Presenter.AnnouncementPresenter.TAG, e.toString());
    if (isViewAttached()) {
        getView().onError(e.toString());
    }
}