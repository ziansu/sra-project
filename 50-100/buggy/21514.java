private void periodicPoller() {
    java.util.TimerTask task = new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            if (poll())
                onNewMessage();
            
        }
    };
    stop();
    timer = new java.util.Timer(true);
    timer.scheduleAtFixedRate(task, java.util.Calendar.getInstance().getTime(), com.mofirouz.javapushmail.MailPoller.SLEEP_TIME);
}