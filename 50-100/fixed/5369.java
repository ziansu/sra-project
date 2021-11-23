public java.util.List<java.lang.String> findPostIdsForUser(java.lang.String username) {
    java.util.List<java.lang.String> posts = new java.util.LinkedList<>();
    java.lang.String userPostsKey = ("user:" + username) + ":posts";
    if ((redisStringSetOps.isMember("allusers", ("user:" + username))) && ((redisStringListOps.size(userPostsKey)) != 0)) {
        posts.addAll(redisStringListOps.range(userPostsKey, 0, (-1)));
    }
    return posts;
}