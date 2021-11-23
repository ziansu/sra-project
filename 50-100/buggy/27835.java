@java.lang.Override
public void onConfiguration(vandy.mooc.presenter.VideoOps.View view, boolean firstTimeIn) {
    final java.lang.String time = (firstTimeIn) ? "first time" : "second+ time";
    android.util.Log.d(vandy.mooc.presenter.VideoOps.TAG, ((("onConfiguration() called the " + time) + " with view = ") + view));
    mVideoView = new java.lang.ref.WeakReference<>(view);
    if (firstTimeIn) {
        mVideoMediator = new vandy.mooc.model.mediator.VideoDataMediator();
        mAdapter = new vandy.mooc.view.ui.VideoAdapter(mVideoView.get().getApplicationContext());
        getVideoList();
    }
    mVideoView.get().setAdapter(mAdapter);
}