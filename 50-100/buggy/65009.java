@java.lang.Override
public void run() {
    if (((mMediaPlayer) != null) && (mMediaPlayer.isPlaying())) {
        mCurrentPosition = mMediaPlayer.getCurrentPosition();
        android.os.Message msg = android.os.Message.obtain();
        msg.what = uk.me.feixie.xfplayer.utils.GloableConstants.MUSIC_PROGRESS_UPDATE;
        msg.arg1 = mCurrentPosition;
        try {
            mMessenger.send(msg);
        } catch (android.os.RemoteException e) {
            e.printStackTrace();
        }
    }
}