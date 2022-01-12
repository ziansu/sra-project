@java.lang.Override
public void onSuccess(com.auth0.core.UserProfile userProfile, com.auth0.core.Token token) {
    authCallbackSuccess(userProfile, token);
}