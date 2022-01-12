public void onSuccess(java.util.List<com.usp.kiss.shared.model.Episode> result) {
    episodes = result;
    episodeContainer.clear();
    AppUtils.EVENT_BUS.fireEvent(new com.usp.kiss.client.ScoreUpdatedEvent());
    int widgetId = 0;
    for (com.usp.kiss.shared.model.Episode episode : result) {
        episodeContainer.add(new com.usp.kiss.client.EpisodeView(episode, isReadOnly, widgetId));
        widgetId++;
    }
    AppUtils.EVENT_BUS.fireEvent(new com.usp.kiss.client.NextEpisodeEvent(openEpisodeEventId));
}