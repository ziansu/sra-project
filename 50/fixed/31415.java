public void share(android.view.View button) {
    if (!(facebook.isSessionValid())) {
        loginAndPostToWall();
    }else {
        postToWall(messageToPost, Name);
    }
}