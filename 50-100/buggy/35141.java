public void setOauth(java.lang.String oauth) {
    if (((oauth = oauth.trim()).length()) < 30)
        throw new IllegalOauthKey(("OAUTH token is the wrong length. Need: 30 Received: " + (oauth.length())));
    
    if (oauth.substring(0, 6).equals("oauth:"))
        oauth = oauth.substring(6);
    
    this.oauth = oauth;
}