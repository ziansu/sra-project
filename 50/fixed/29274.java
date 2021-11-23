public static void unPause() {
    synchronized(events.EventControlPanel.events) {
        events.EventControlPanel.pause = false;
        events.EventControlPanel.events = events.EventControlPanel.pauseBackup;
        events.EventControlPanel.pauseBackup = null;
    }
}