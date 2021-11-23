private static float followerRatio(models.UserProfile user) {
    int friends = user.getUser().getFriendsCount();
    int followers = (user.getUser().getFollowersCount()) + 1;
    float ratio = (((float) (followers)) / followers) + friends;
    return ratio;
}