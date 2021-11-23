public static java.util.concurrent.Future<?> addItemToPlaybackHistory(final de.danoeh.antennapod.core.feed.FeedMedia media) {
    return de.danoeh.antennapod.core.storage.DBWriter.dbExec.submit(() -> {
        android.util.Log.d(de.danoeh.antennapod.core.storage.DBWriter.TAG, "Adding new item to playback history");
        media.setPlaybackCompletionDate(new java.util.Date());
        de.danoeh.antennapod.core.storage.PodDBAdapter adapter = de.danoeh.antennapod.core.storage.PodDBAdapter.getInstance();
        adapter.open();
        adapter.setFeedMediaPlaybackCompletionDate(media);
        adapter.close();
        de.danoeh.antennapod.core.feed.EventDistributor.getInstance().sendPlaybackHistoryUpdateBroadcast();
    });
}