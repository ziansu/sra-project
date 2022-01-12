public static void clearAddedEventTitles() {
    synchronized(com.dancedeets.android.gcm.ListenerService.addedEventTitles) {
        com.dancedeets.android.gcm.ListenerService.addedEventTitles.clear();
    }
}