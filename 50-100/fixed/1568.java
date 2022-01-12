private void checkSessionAlive() {
    getCurrentUser(new net.moddity.droidnubekit.requests.DNKCallback<net.moddity.droidnubekit.responsemodels.DNKUser>() {
        @java.lang.Override
        public void success(net.moddity.droidnubekit.responsemodels.DNKUser dnkUser) {
            if ((cloudKitAuthHandler) != null)
                cloudKitAuthHandler.onAuthSucceed();
            
            currentUser = dnkUser;
        }

        @java.lang.Override
        public void failure(java.lang.Throwable exception) {
        }
    });
}