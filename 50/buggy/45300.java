private void scheduleAllNotificationInBackground() {
    cancelAllScheduledNotification();
    java.lang.Thread notificationThread = new java.lang.Thread() {
        @java.lang.Override
        public void run() {
            super.run();
            scheduleAllNotification();
        }
    };
    notificationThread.start();
}