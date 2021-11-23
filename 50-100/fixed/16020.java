@java.lang.Override
public void run() {
    try {
        java.lang.Thread.sleep(500);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    if (((mMediaPlayer) != null) && (mMediaPlayer.isPlaying())) {
        if (net.alexandroid.spotifystreamer.helpers.MyApplication.isPlayerVisible) {
            de.greenrobot.event.EventBus.getDefault().post(new net.alexandroid.spotifystreamer.events.UiUpdateEvent(mMediaPlayer.getCurrentPosition()));
        }
        mUpdaterCounter.run();
    }
}