private void fetchFollowersIfHasRemaining() {
    if (followersRateLimit.hasRemaining()) {
        try {
            followersRateLimit.decrement();
            batchFetcher.fetchFollowersBatch();
        } catch (java.lang.Exception e) {
            org.draff.twitfetch.FollowersFetcher.log.log(java.util.logging.Level.SEVERE, ("Error fetching followers: " + (e.toString())), e);
        }
    }
}