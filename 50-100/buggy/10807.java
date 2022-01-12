@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btn__download_map :
            com.mapswithme.maps.downloader.MapManager.nativeDownload(mCurrentCountry.id);
            break;
        case R.id.btn__select_map :
            getMwmActivity().replaceFragment(com.mapswithme.maps.downloader.DownloaderFragment.class, null, null);
            break;
        case R.id.wpv__download_progress :
            com.mapswithme.maps.downloader.MapManager.nativeCancel(mDownloadingCountry.id);
            Statistics.INSTANCE.trackEvent(Statistics.EventName.DOWNLOADER_CANCEL, com.mapswithme.util.statistics.Statistics.params().add(Statistics.EventParam.FROM, "search"));
            break;
    }
}