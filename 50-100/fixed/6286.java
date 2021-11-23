@java.lang.Override
public void onDestroy() {
    mHandler.removeCallbacksAndMessages(null);
    mTrackCompletionHandler.removeCallbacksAndMessages(null);
    mTimeUpdateHandler.removeCallbacksAndMessages(null);
    if (mMusicBound) {
        getActivity().unbindService(mMusicConnection);
    }
    mMediaPlayerService = null;
    super.onDestroy();
}