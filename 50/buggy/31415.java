public void share(android.view.View button) {
    if (!(facebook.isSessionValid())) {
        loginAndPostToWall();
        finish();
    }else {
        postToWall(messageToPost, Name);
    }
}