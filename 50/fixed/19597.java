@java.lang.Override
public void success(List<com.soomla.profile.domain.gameservices.Leaderboard> result, boolean hasMore) {
    if (reward != null) {
        reward.give();
    }
    com.soomla.BusProvider.getInstance().post(new com.soomla.profile.GetLeaderboardsFinishedEvent(provider, result, payload));
}