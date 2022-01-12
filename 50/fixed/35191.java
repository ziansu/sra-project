public retrofit2.Call<com.onehilltech.gatekeeper.android.http.JsonBearerToken> getClientToken() {
    com.onehilltech.gatekeeper.android.http.JsonClientCredentials credentials = new com.onehilltech.gatekeeper.android.http.JsonClientCredentials();
    return this.getToken(credentials);
}