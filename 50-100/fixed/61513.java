public void loadTweets() {
    com.codepath.apps.simpletwitterclient.lib.Network network = new com.codepath.apps.simpletwitterclient.lib.Network();
    if (network.isNetworkAvailable(getActivity())) {
        loadTweetsFromNetwork();
    }else {
        com.codepath.apps.simpletwitterclient.lib.Toaster.create(getActivity(), "Sorry, the network appears to be down. Showing cached data");
        com.codepath.apps.simpletwitterclient.lib.Toaster.create(getActivity(), "Pull to refresh to try again");
        loadTweetsFromCache();
        if ((swipeContainer) != null) {
            swipeContainer.setRefreshing(false);
        }
    }
}