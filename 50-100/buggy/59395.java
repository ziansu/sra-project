@java.lang.Override
public void onFollow(models.User user) {
    if (models.User.logger.underlyingLogger().isDebugEnabled()) {
        models.User.logger.underlyingLogger().debug((((("[localUser=" + (this.id)) + "][u=") + (user.id)) + "] User onFollow"));
    }
    if (!(isFollowing(user))) {
        boolean followed = recordFollow(user);
        if (followed) {
            (user.numFollowers)++;
            (this.numFollowings)++;
        }
    }
}