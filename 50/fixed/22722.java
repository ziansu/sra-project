@java.lang.Override
public void onClick(android.view.View view) {
    hostWillingness = 0;
    mServiceBroadcastingHandler.postDelayed(mServiceBroadcastingRunnable, com.semaphore_soft.apps.cypher.MainActivity.SERVICE_BROADCASTING_INTERVAL);
    discoverService();
}