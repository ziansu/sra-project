public static boolean isLoggedIn() {
    return com.simonc312.apps.tweetrandomwords.rest.RestApplication.getRestClient().isAuthenticated();
}