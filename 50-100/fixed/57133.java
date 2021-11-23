public void follow(java.lang.String usernameFollower, java.lang.String usernameFollowing) {
    java.lang.String followerKey = ("user:" + usernameFollower) + ":following";
    java.lang.String followingKey = ("user:" + usernameFollowing) + ":follower";
    redisStringSetOps.add(followerKey, usernameFollowing);
    redisStringSetOps.add(followingKey, usernameFollower);
}