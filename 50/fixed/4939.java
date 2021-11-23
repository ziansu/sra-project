void onExitForeground(final long timestamp) {
    runOnLogThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            refreshSessionTime(timestamp);
            inForeground = false;
            if (flushEventsOnClose) {
                updateServer(null);
            }
        }
    });
}