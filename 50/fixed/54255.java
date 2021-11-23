public java.util.Set<java.lang.String> getMessages() {
    if (user.User.dbMessages.containsKey(username)) {
        return user.User.dbMessages.get(username);
    }else {
        return new java.util.HashSet<java.lang.String>();
    }
}