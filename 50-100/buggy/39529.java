@java.lang.Override
public void complete(boolean argSucces, @android.support.annotation.NonNull
org.bottiger.podcast.provider.ISubscription argSubscription) {
    boolean downloadOnUpdate = org.bottiger.podcast.utils.PreferenceHelper.getBooleanPreferenceValue(getApplicationContext(), R.string.pref_refresh_only_wifi_key, R.bool.pref_refresh_only_wifi_default);
    if (argSubscription instanceof org.bottiger.podcast.provider.Subscription) {
        org.bottiger.podcast.provider.Subscription subscription = ((org.bottiger.podcast.provider.Subscription) (argSubscription));
        downloadOnUpdate = subscription.doDownloadNew(downloadOnUpdate);
    }
    if (!downloadOnUpdate)
        return ;
    
    org.bottiger.podcast.service.Downloader.SoundWavesDownloadManager.downloadNewEpisodes(getApplicationContext(), argSubscription);
    jobFinished(params, true);
}