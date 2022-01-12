private void disableAllListeners() {
    synchronized(listeners) {
        for (edu.umd.fcmd.sensorlisteners.listener.Listener l : listeners) {
            l.stopListening();
            MyApplication.madcapLogger.d(org.fraunhofer.cese.madcap.services.DataCollectionService.TAG, ((l.getClass().getSimpleName()) + " stopped listening"));
        }
    }
}