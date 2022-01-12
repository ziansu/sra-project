@java.lang.Override
public void onLoggedOut(com.box.androidsdk.content.auth.BoxAuthentication.BoxAuthenticationInfo info, java.lang.Exception ex) {
    if (sameUser(info)) {
        getAuthInfo().wipeOutAuth();
        setUserId(null);
        if ((sessionAuthListener) != null) {
            sessionAuthListener.onLoggedOut(info, ex);
        }
    }
}