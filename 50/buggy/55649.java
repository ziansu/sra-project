@java.lang.Override
public void success(net.moddity.droidnubekit.responsemodels.DNKUser dnkUser) {
    if ((net.moddity.droidnubekit.DroidNubeKit.getInstance().cloudKitAuthHandler) != null)
        net.moddity.droidnubekit.DroidNubeKit.getInstance().cloudKitAuthHandler.onAuthSucceed();
    
    currentUser = dnkUser;
}