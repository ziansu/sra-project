private void fetchFollowersIfHasRemaining() {
    try {
        batchFetcher.fetchFollowersBatch();
        followersRateLimit.decrement();
    } catch (java.lang.Exception e) {
        org.draff.twitfetch.FollowersFetcher.log.log(java.util.logging.Level.SEVERE, ("Error fetching followers: " + (e.toString())), e);
    }
}