private void handleNewFacebookUser() {
    com.facebook.GraphRequest request = com.facebook.GraphRequest.newMeRequest(com.facebook.AccessToken.getCurrentAccessToken(), this);
    android.os.Bundle parameters = new android.os.Bundle();
    parameters.putString("fields", "id,name,email");
    request.setParameters(parameters);
    request.executeAsync();
}