@java.lang.Override
public void success(List<com.soomla.profile.domain.gameservices.Score> result, boolean hasMore) {
    com.soomla.BusProvider.getInstance().post(new com.soomla.profile.GetScoresFinishedEvent(provider, leaderboard, result, hasMore, payload));
    if (reward != null) {
        reward.give();
    }
}