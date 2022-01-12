private void checkSessionAlive() {
    net.moddity.droidnubekit.DroidNubeKit.getCurrentUser(new net.moddity.droidnubekit.requests.DNKCallback<net.moddity.droidnubekit.responsemodels.DNKUser>() {
        @java.lang.Override
        public void success(net.moddity.droidnubekit.responsemodels.DNKUser dnkUser) {
            if ((net.moddity.droidnubekit.DroidNubeKit.getInstance().cloudKitAuthHandler) != null)
                net.moddity.droidnubekit.DroidNubeKit.getInstance().cloudKitAuthHandler.onAuthSucceed();
            
            currentUser = dnkUser;
        }

        @java.lang.Override
        public void failure(java.lang.Throwable exception) {
        }
    });
}