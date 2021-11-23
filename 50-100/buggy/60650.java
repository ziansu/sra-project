private void startTicking() {
    if ((mTimer) == null) {
        mTimer = new java.util.Timer();
        mTimer.schedule(new java.util.TimerTask() {
            @java.lang.Override
            public void run() {
                if (mPlayer.isPlaying())
                    de.greenrobot.event.EventBus.getDefault().post(new dengn.spotifystreamer.events.TickEvent(getDuration(), getCurrentPosition()));
                
            }
        }, 0, 100);
    }
}