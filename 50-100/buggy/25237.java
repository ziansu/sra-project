public boolean isEmpty(java.lang.String channel) {
    synchronized(log) {
        if ((!(log.containsKey(channel.toLowerCase()))) || (getArray(channel.toLowerCase()).isEmpty())) {
            return true;
        }
        return false;
    }
}