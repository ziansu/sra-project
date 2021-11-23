public com.linecorp.sample.login.infra.line.api.v2.response.Verify verify(final com.linecorp.sample.login.infra.line.api.v2.response.AccessToken accessToken) {
    return getClient(( t) -> t.verify(accessToken.access_token, channelId, channelSecret));
}