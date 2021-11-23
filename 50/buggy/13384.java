@java.lang.Override
public void onStart() {
    super.onStart();
    mediaBrowser.connect();
    if (!(android.support.v17.leanback.app.BackgroundManager.getInstance(getActivity()).isAttached())) {
        prepareBackgroundManager();
    }
}