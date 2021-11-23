private void periodicPoller() {
    java.util.TimerTask task = new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            boolean p = poll();
            if (p)
                onNewMessage();
            
        }
    };
    stop();
    timer = new java.util.Timer(name, true);
    timer.scheduleAtFixedRate(task, java.util.Calendar.getInstance().getTime(), com.mofirouz.javapushmail.MailPoller.SLEEP_TIME);
}