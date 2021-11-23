private final void addUser(java.lang.String channel, org.jibble.pircbot.User user) {
    channel = channel.toLowerCase();
    synchronized(_channels) {
        java.util.Hashtable users = ((java.util.Hashtable) (_channels.get(channel)));
        if (users == null) {
            users = new java.util.Hashtable();
            _channels.put(channel, users);
        }
        users.put(user, user);
    }
}