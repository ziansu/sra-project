private void syncUpdates() {
    java.util.List<byte[]> updates = remoteJedis.lrange(org.ulyssis.ipp.config.Config.getCurrentConfig().getUpdatesList().getBytes(), ((lastUpdate) + 1), (-1L));
    for (byte[] update : updates) {
        processMessage(update);
    }
    lastUpdate += updates.size();
}