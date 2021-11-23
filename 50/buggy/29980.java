private void authCodeSignIn() {
    com.couchbase.grocerysync.Application application = ((com.couchbase.grocerysync.Application) (getApplication()));
    application.loginWithAuthCode(this);
}