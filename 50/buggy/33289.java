public void addFriend(s2wmp.User friend) {
    if (!(friends.containsKey(friend))) {
        friends.put(friend.id.id, friend);
    }
}