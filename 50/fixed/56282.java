public boolean hasPlayer(java.lang.String user) {
    if ((users) == null)
        return false;
    
    return (users.contains(user.toLowerCase())) || (user.equalsIgnoreCase(leader));
}