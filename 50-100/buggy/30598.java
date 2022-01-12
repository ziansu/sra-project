private void handleNewFacebookUser() {
    if ((com.parse.ParseUser.getCurrentUser().isNew()) && (com.parse.ParseFacebookUtils.isLinked(com.parse.ParseUser.getCurrentUser()))) {
        com.facebook.GraphRequest request = com.facebook.GraphRequest.newMeRequest(com.facebook.AccessToken.getCurrentAccessToken(), this);
        android.os.Bundle parameters = new android.os.Bundle();
        parameters.putString("fields", "id,name,email");
        request.setParameters(parameters);
        request.executeAsync();
    }
}