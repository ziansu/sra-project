@java.lang.Override
public void run() {
    if (((mMediaPlayer) != null) && (mMediaPlayer.isPlaying())) {
        try {
            java.lang.Thread.sleep(500);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        if (net.alexandroid.spotifystreamer.helpers.MyApplication.isPlayerVisible) {
            de.greenrobot.event.EventBus.getDefault().post(new net.alexandroid.spotifystreamer.events.UiUpdateEvent(mMediaPlayer.getCurrentPosition()));
        }
        mUpdaterCounter.run();
    }
}