@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    final int id = item.getItemId();
    if (id == (android.R.id.home)) {
        finish();
        return true;
    }else
        if (id == (R.id.menu_playback_share)) {
            final com.addhen.spotify.model.TrackModel trackModel = mPlaybackFragment.getCurrentlyPlayingSong();
            setShareIntent(trackModel);
            return true;
        }
    
    return super.onOptionsItemSelected(item);
}