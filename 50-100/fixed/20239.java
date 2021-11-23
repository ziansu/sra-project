public void loadBackgroundTimer(int minutes) {
    if (!(timerLoaded)) {
        timerLoaded = true;
        new java.util.Timer().schedule(new java.util.TimerTask() {
            @java.lang.Override
            public void run() {
                if ((plugin) != null) {
                    update();
                }else {
                    cancel();
                }
            }
        }, (60 * 1000), ((minutes * 60) * 1000));
    }else {
        debug("Timer is already loaded");
    }
}