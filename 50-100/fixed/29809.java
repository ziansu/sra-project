private final org.jibble.pircbot.User getUserByNick(java.lang.String nick) {
    nick = getRealNick(nick);
    final org.jibble.pircbot.User[] usrs = getUsers(Config.mainChannel);
    for (final org.jibble.pircbot.User u : usrs)
        if (nick.equals(getRealNick(u.getNick())))
            return u;
        
    
    return null;
}