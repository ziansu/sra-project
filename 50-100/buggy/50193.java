public void onLiveMessageHandlerDestroyed(com.v2tech.service.LiveMessageHandler lsh) {
    synchronized(liveMessageHandlerList) {
        int size = liveMessageHandlerList.size();
        for (int i = 0; i < size; i++) {
            java.lang.ref.WeakReference<com.v2tech.service.LiveMessageHandler> w = liveMessageHandlerList.get(i);
            com.v2tech.service.LiveMessageHandler act = w.get();
            if (act != null) {
                liveMessageHandlerList.remove(i);
            }
        }
    }
}