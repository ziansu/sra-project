@java.lang.Override
public void onDestroy() {
    MyApplication.madcapLogger.d(org.fraunhofer.cese.madcap.services.DataCollectionService.TAG, "onDestroy");
    super.onDestroy();
    synchronized(listeners) {
        for (edu.umd.fcmd.sensorlisteners.listener.Listener l : listeners) {
            l.stopListening();
            MyApplication.madcapLogger.d(org.fraunhofer.cese.madcap.services.DataCollectionService.TAG, ((l.getClass().getSimpleName()) + " stopped listening"));
        }
        listeners.clear();
    }
    cache.removeUploadListener(this);
    cache.close();
}