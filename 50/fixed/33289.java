public void addFriend(s2wmp.User friend) {
    if (!(friends.containsKey(friend.id.id))) {
        friends.put(friend.id.id, friend);
    }
}