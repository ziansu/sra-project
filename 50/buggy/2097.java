public java.util.List<org.asteriskjava.live.DialedChannelHistoryEntry> getDialedChannelHistory() {
    final java.util.List<org.asteriskjava.live.DialedChannelHistoryEntry> copy;
    synchronized(linkedChannelHistory) {
        copy = new java.util.ArrayList(dialedChannelHistory);
    }
    return copy;
}