public boolean isAnUnrequitedFollower(com.connectagram.network.models.User user) {
    return (!(((mMapUnrequitedFollowers) == null) || (mMapUnrequitedFollowers.isEmpty()))) && (mMapUnrequitedFollowers.containsKey(user.id));
}