public void start() {
    if ((thread) != null) {
        thread = new com.therandomlabs.trlbotutils.ChannelClearer.ChannelClearerThread();
        thread.start();
    }
}