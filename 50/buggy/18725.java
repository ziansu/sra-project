public com.onehilltech.gatekeeper.android.JsonRequest loginUser(java.lang.String username, java.lang.String password, final com.onehilltech.gatekeeper.android.ResponseListener<com.onehilltech.gatekeeper.android.model.UserToken> listener) {
    return this.client_.getUserToken(username, password, listener);
}