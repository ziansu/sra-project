@java.lang.Override
public void onClick(android.view.View v) {
    if ((mListView.getCheckedItemPosition()) > 0) {
        calledAfterStopFunction = true;
        mMediaPlayer.stop();
        mMediaPlayer.reset();
        isStopped = true;
        mListView.setItemChecked(((mListView.getCheckedItemPosition()) - 1), true);
        playTrack(mListView);
    }
}