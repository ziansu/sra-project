@java.lang.Override
public void artistSearchEnded() {
    android.util.Log.v(au.com.kbrsolutions.spotifystreamer.activities.SpotifyStreamerActivity.LOG_TAG, ("showTracksData - mTracksFragment: " + (mTracksFragment)));
    if (((mTracksFragment) != null) && (mTracksFragment.isVisible())) {
        mTracksFragment.setEmptyText("Select an artist to see top 10 tracks");
    }
}