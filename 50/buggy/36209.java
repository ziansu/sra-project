public void rebuildFriendsList() {
    synchronized(friendGroup) {
        friendGroup.clear();
    }
    searchFriends();
}