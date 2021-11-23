@java.lang.Override
public void onClick(android.view.View v) {
    if ((mListView.getCheckedItemPosition()) < ((mList.size()) - 1)) {
        calledAfterStopFunction = true;
        mMediaPlayer.stop();
        mMediaPlayer.reset();
        isStopped = true;
        mListView.setItemChecked(((mListView.getCheckedItemPosition()) + 1), true);
        playTrack();
    }
}