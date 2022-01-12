@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onReceiveStateInMain(com.tan.musicplayer.common.PlayerEvent.StateEvent event) {
    mIsBusy = false;
    android.util.Log.i(com.tan.musicplayer.base.BasePlayerAcitvity.TAG, "onReceiveStateInMain: ");
    if ((event.songs) != null) {
        mSongs = event.songs;
        onSetSongs();
        mCurrentTime = event.time;
        mCurrentSongIndex = event.index;
        mIsPlaying = event.isPlaying;
        mDuration = mSongs.get(mCurrentSongIndex).getFileDuration();
        onReceiveServiceStateSuccess(false);
        mIsServiceEmpty = false;
    }else {
        mIsServiceEmpty = true;
        onReceiveServiceStateSuccess(true);
    }
}