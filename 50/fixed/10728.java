public void follow(int followerId, int followeeId) {
    setUpUser(followerId);
    setUpUser(followeeId);
    userToFollowee.get(followerId).add(followeeId);
}