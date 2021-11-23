private final void addUser(java.lang.String channel, org.jibble.pircbot.User user) {
    channel = channel.toLowerCase();
    synchronized(_channels) {
        java.util.Hashtable<org.jibble.pircbot.User, org.jibble.pircbot.User> users = ((java.util.Hashtable<org.jibble.pircbot.User, org.jibble.pircbot.User>) (_channels.get(channel)));
        if (users == null) {
            users = new java.util.Hashtable<org.jibble.pircbot.User, org.jibble.pircbot.User>();
            _channels.put(channel, users);
        }
        users.put(user, user);
    }
}