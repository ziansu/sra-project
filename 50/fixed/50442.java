public boolean hasPlayer(java.lang.String user) {
    return (users.contains(user.toLowerCase())) || (user.equalsIgnoreCase(leader));
}