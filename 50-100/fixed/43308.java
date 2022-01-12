private void setupRows() {
    android.support.v17.leanback.widget.ClassPresenterSelector ps = new android.support.v17.leanback.widget.ClassPresenterSelector();
    android.support.v17.leanback.widget.PlaybackControlsRowPresenter playbackControlsRowPresenter = new android.support.v17.leanback.widget.PlaybackControlsRowPresenter();
    playbackControlsRowPresenter.setOnActionClickedListener(mOnActionListener);
    playbackControlsRowPresenter.setSecondaryActionsHidden(false);
    ps.addClassPresenter(android.support.v17.leanback.widget.PlaybackControlsRow.class, playbackControlsRowPresenter);
    mRowsAdapter = new android.support.v17.leanback.widget.ArrayObjectAdapter(ps);
    addPlaybackControlsRow();
    setAdapter(mRowsAdapter);
}