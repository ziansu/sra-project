@java.lang.Override
public com.beautysight.liurushi.identityaccess.domain.model.UserProfile call() throws java.lang.Exception {
    com.beautysight.liurushi.identityaccess.domain.model.User user = accessTokenService.getUserBy(accessToken, type);
    return user.toUserProfile();
}