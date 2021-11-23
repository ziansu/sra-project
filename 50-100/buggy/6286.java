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
    boolean showDialog = getResources().getBoolean(R.bool.show_dialog);
    if (!showDialog) {
        getActivity().finish();
    }
}