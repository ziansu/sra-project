public int leaveChannel(java.lang.String n, int id) {
    Channel c = channelExists(n);
    if (c == null) {
        return 0;
    }
    synchronized(c) {
        c.removeMember(id);
    }
    return 0;
}