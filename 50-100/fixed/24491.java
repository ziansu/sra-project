private void restoreOrCreatePresenter(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    if (savedInstanceState != null) {
        presenterUUID = ((java.util.UUID) (savedInstanceState.getSerializable(com.kvest.mvp.PresenterFragment.KEY_PRESENTER_UUID)));
        presenter = ((T) (presenterPersistStorage.getPresenter(presenterUUID)));
        if ((presenter) != null) {
            onPresenterRestored(presenter);
        }
    }
    if ((presenter) == null) {
        presenter = createPresenter();
        presenterUUID = presenterPersistStorage.addPresenter(presenter);
    }
}