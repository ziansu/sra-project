private final org.jibble.pircbot.User removeUser(java.lang.String channel, java.lang.String nick) {
    channel = channel.toLowerCase();
    org.jibble.pircbot.User user = new org.jibble.pircbot.User("", nick);
    synchronized(_channels) {
        java.util.Hashtable<?, ?> users = ((java.util.Hashtable<?, ?>) (_channels.get(channel)));
        if (users != null) {
            return ((org.jibble.pircbot.User) (users.remove(user)));
        }
    }
    return null;
}