private void setTokens(com.mcnaughton.client.spotifyModels.AccessResponse response) {
    com.mcnaughton.client.SpotifyClient.accessToken = response.getAccess_token();
    if ((response.getRefresh_token()) != null) {
        com.mcnaughton.client.SpotifyClient.refreshToken = response.getRefresh_token();
    }
    com.mcnaughton.client.SpotifyClient.tokenType = response.getToken_type();
    com.mcnaughton.client.SpotifyClient.expireDate = org.joda.time.DateTime.now().plusSeconds(response.getExpires_in());
}