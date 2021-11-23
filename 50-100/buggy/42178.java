@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    if (!(calledAfterStopFunction)) {
        mMediaPlayer.reset();
        isStopped = true;
        if ((mListView.getCheckedItemPosition()) < ((mList.size()) - 1)) {
            mListView.setItemChecked(((mListView.getCheckedItemPosition()) + 1), true);
            playTrack(mListView);
        }else {
            calledAfterSetProgressFunction = true;
            mSeekSeekBar.setProgress(0);
        }
    }else {
        calledAfterStopFunction = false;
    }
}