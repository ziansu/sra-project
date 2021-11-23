@java.lang.Override
protected void onResume() {
    if (onCreate) {
        onCreate = false;
    }else {
        if ((mPlayer) != null)
            mPlayer.getMediaControl().start();
        
        mPlayer.resumePlayer();
        com.kaltura.playersdk.utils.LogUtils.LOGD(com.kaltura.adplayerdemo.MainActivity.TAG, "on Resume called for player");
        if ((mAdPlayer) != null) {
            mAdPlayer.moveSurfaceToForeground();
            mAdPlayer.play();
        }
    }
    super.onResume();
    com.kaltura.adplayerdemo.NetworkChangeReceiver.getObservable().addObserver(this);
}