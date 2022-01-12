private static final boolean equalsUUID(java.util.UUID one, java.util.UUID two) {
    boolean equal = false;
    if ((one == null) || (two == null))
        equal = false;
    else
        equal = one.equals(two);
    
    if (equal)
        return true;
    
    java.lang.String user1 = net.minecraftforge.common.UsernameCache.getLastKnownUsername(one);
    java.lang.String user2 = net.minecraftforge.common.UsernameCache.getLastKnownUsername(two);
    if ((user1 == null) || (user1 == null))
        return false;
    else
        return user1.equalsIgnoreCase(user2);
    
}