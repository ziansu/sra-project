@java.lang.Override
public void success(List<com.soomla.profile.domain.gameservices.Leaderboard> result, boolean hasMore) {
    com.soomla.BusProvider.getInstance().post(new com.soomla.profile.GetLeaderboardsFinishedEvent(provider, result, payload));
    if (reward != null) {
        reward.give();
    }
}