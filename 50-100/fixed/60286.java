public fm.ensemble.soundcloud.SoundCloud build() {
    com.soundcloud.api.Token token = null;
    if ((accessToken) != null) {
        token = new com.soundcloud.api.Token(accessToken, refreshToken, scope);
    }
    com.soundcloud.api.ApiWrapper api = new com.soundcloud.api.ApiWrapper(clientId, clientSecret, redirectUri, token);
    fm.ensemble.soundcloud.SoundCloud sc = new fm.ensemble.soundcloud.SoundCloud(api);
    sc.scope = this.scope;
    return sc;
}