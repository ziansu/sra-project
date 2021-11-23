public void startFlushTimer() {
    if (((mFlushInterval) <= 0) || ((mTimer) != null)) {
        return ;
    }
    mTimer = new java.util.Timer();
    java.util.TimerTask task = new java.util.TimerTask() {
        io.lqd.sdk.Liquid instance = io.lqd.sdk.Liquid.getInstance();

        @java.lang.Override
        public void run() {
            instance.flush();
        }
    };
    mTimer.scheduleAtFixedRate(task, 0, ((mFlushInterval) * 1000));
    io.lqd.sdk.LQLog.infoVerbose("Started flush timer");
}