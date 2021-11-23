public static void resetEvents() {
    synchronized(com.aimbrain.androidsdk.library.EventStore.sync) {
        com.aimbrain.androidsdk.library.EventStore.eventList = new org.json.JSONArray();
    }
}