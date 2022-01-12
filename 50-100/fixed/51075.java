@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.menu_add :
            org.bottiger.podcast.utils.AddPodcastDialog.addPodcast(this);
            return true;
        case R.id.menu_settings :
            org.bottiger.podcast.utils.TransitionUtils.openSettings(this);
            return true;
        case R.id.menu_refresh :
            org.bottiger.podcast.service.PodcastDownloadManager.start_update(this);
            return true;
    }
    return super.onOptionsItemSelected(item);
}