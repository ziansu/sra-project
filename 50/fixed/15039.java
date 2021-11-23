public boolean sentRequest(java.lang.String friendUsername) {
    if (!(user.User.dbFriendRequests.containsKey(friendUsername)))
        return false;
    
    return user.User.dbFriendRequests.get(friendUsername).contains(username);
}