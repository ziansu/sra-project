public boolean isEmpty(java.lang.String channel) {
    synchronized(log) {
        channel = channel.toLowerCase();
        if ((!(log.containsKey(channel))) || (getArray(channel).isEmpty())) {
            return true;
        }
        return false;
    }
}