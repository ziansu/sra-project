public java.util.Set<java.lang.String> getFollowingIds(java.lang.String username) {
    java.util.Set<java.lang.String> following = new java.util.HashSet<>();
    java.lang.String followingKey = ("user:" + username) + ":following";
    if ((redisStringSetOps.isMember("allusers", ("user:" + username))) && ((redisStringSetOps.size(followingKey)) != 0)) {
        following.addAll(redisStringSetOps.members(followingKey));
    }
    return following;
}