public boolean isUserAllowed(java.lang.String username) {
    return (!(allowedUsers.isEmpty())) || (allowedUsers.contains(username));
}