@java.lang.Override
public void onNext(com.connectagram.network.models.FollowRequest followRequest) {
    for (com.connectagram.network.models.User user : followRequest.data) {
        searchedUser.addFollower(user);
        if ((!(searchedUser.isCurrentUser())) && (com.connectagram.network.models.User.getCurrentUser().hasFollower(user))) {
            mMapMutualFollowers.put(user.getUserId(), user);
        }
    }
}