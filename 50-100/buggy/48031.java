private void periodicProber() {
    java.util.TimerTask task = new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            if ((mail) == null)
                onNetworkChange(probe());
            else
                onNetworkChange(probeWithSessionCheck());
            
        }
    };
    stop();
    timer = new java.util.Timer(true);
    timer.scheduleAtFixedRate(task, java.util.Calendar.getInstance().getTime(), com.mofirouz.javapushmail.NetworkProber.SLEEP_TIME);
}