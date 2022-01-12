private void loginToSpotifyAccount() {
    com.spotify.sdk.android.authentication.AuthenticationRequest.Builder builder = new com.spotify.sdk.android.authentication.AuthenticationRequest.Builder(com.vibejukebox.jukebox.JukeboxApplication.SPOTIFY_API_CLIENT_ID, AuthenticationResponse.Type.TOKEN, com.vibejukebox.jukebox.JukeboxApplication.SPOTIFY_API_REDIRECT_URI);
    builder.setShowDialog(false).setScopes(new java.lang.String[]{ "user-read-private" , "playlist-read-private" , "playlist-read-collaborative" , "streaming" , "user-library-read" });
    com.spotify.sdk.android.authentication.AuthenticationRequest request = builder.build();
    com.spotify.sdk.android.authentication.AuthenticationClient.openLoginActivity(this, com.vibejukebox.jukebox.activities.VibeJukeboxMainActivity.SPOTIFY_API_REQUEST_CODE, request);
}