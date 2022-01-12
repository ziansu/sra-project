public void setOauth(java.lang.String oauth) {
    if (((oauth = oauth.trim()).length()) != 30)
        throw new IllegalOauthKey(("OAUTH token is the wrong length. Need: 30 Received: " + (oauth.length())));
    
    this.oauth = oauth;
}