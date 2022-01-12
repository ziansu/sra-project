public void addFollowing(com.connectagram.network.models.User user) {
    if ((mMapFollowing) == null) {
        mMapFollowing = new java.util.HashMap<>();
    }
    if ((mFollowingSet) == null) {
        mFollowingSet = new java.util.HashSet<>();
    }
    if ((user.id) != null) {
        mMapFollowing.put(user.id, user);
    }
    if ((user.username) != null) {
        mFollowingSet.add(user.username.toLowerCase());
    }
}