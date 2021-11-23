@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    mPlayerReady = false;
    if ((mPlayer) != null)
        mPlayer.release();
    
}