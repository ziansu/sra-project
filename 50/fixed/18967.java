public static void unregisterActivityReceiver(android.content.BroadcastReceiver receiver) {
    if (com.adsamcik.signalcollector.Play.PlayController.apiActivity)
        com.adsamcik.signalcollector.Play.PlayController.c.unregisterReceiver(receiver);
    
}