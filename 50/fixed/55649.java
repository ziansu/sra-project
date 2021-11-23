@java.lang.Override
public void success(net.moddity.droidnubekit.responsemodels.DNKUser dnkUser) {
    if ((cloudKitAuthHandler) != null)
        cloudKitAuthHandler.onAuthSucceed();
    
    currentUser = dnkUser;
}