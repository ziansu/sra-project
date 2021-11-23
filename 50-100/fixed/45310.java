private void authenticateUser() {
    com.spotify.sdk.android.authentication.AuthenticationRequest.Builder builder = new com.spotify.sdk.android.authentication.AuthenticationRequest.Builder(SpotifyDataManager.CLIENT_ID, com.spotify.sdk.android.authentication.AuthenticationResponse.Type.TOKEN, SpotifyDataManager.REDIRECT_URI);
    builder.setScopes(new java.lang.String[]{ "user-read-private" , "user-library-modify" });
    com.spotify.sdk.android.authentication.AuthenticationRequest request = builder.build();
    com.spotify.sdk.android.authentication.AuthenticationClient.openLoginActivity(this, com.goosebay.musica.MainActivity.REQUEST_CODE_LOGIN, request);
}