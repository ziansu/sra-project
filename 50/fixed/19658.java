@java.lang.Override
protected void onPostExecute(final java.util.ArrayList<com.sidzi.circleofmusic.entities.Track> tracks) {
    super.onPostExecute(tracks);
    trackListAdapter.updateTracks(tracks);
}