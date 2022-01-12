private void sendTrackUpdate() {
    if ((mTrack) != null) {
        android.content.Intent i = new android.content.Intent();
        i.setAction(org.y20k.trackbook.ACTION_TRACK_UPDATED);
        i.putExtra(org.y20k.trackbook.EXTRA_TRACK, mTrack);
        i.putExtra(org.y20k.trackbook.EXTRA_LAST_LOCATION, mCurrentBestLocation);
        android.support.v4.content.LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(i);
    }
}