private void onMessageListener(java.lang.String channel, java.lang.String message) {
    long updateId = java.lang.Long.parseLong(message, 10);
    java.util.List<byte[]> updates = remoteJedis.lrange(org.ulyssis.ipp.config.Config.getCurrentConfig().getUpdatesList().getBytes(), ((lastUpdate) + 1L), updateId);
    for (byte[] update : updates) {
        processMessage(update);
    }
}