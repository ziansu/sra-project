private void restoreOrCreatePresenter(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    if (savedInstanceState != null) {
        presenterUUID = ((java.util.UUID) (savedInstanceState.getSerializable(com.kvest.mvp.PresenterActivity.KEY_PRESENTER_UUID)));
        presenter = ((T) (com.kvest.mvp.PresenterActivity.getPresenter(presenterUUID)));
        if ((presenter) != null) {
            onPresenterRestored(presenter);
        }else {
            presenter = createPresenter();
            presenterUUID = com.kvest.mvp.PresenterActivity.addPresenter(presenter);
        }
    }
}