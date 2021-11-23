@java.lang.Override
public void gotUserDetail(com.soomla.profile.social.twitter.User user) {
    com.soomla.SoomlaUtils.LogDebug(com.soomla.profile.social.twitter.SoomlaTwitter.TAG, "getUserProfile/onComplete");
    com.soomla.profile.domain.UserProfile userProfile = createUserProfile(user, true);
    com.soomla.profile.social.twitter.SoomlaTwitter.RefUserProfileListener.success(userProfile);
    com.soomla.profile.social.twitter.SoomlaTwitter.clearListener(com.soomla.profile.social.twitter.SoomlaTwitter.ACTION_GET_USER_PROFILE);
}