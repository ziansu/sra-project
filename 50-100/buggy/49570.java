@java.lang.Override
protected void onPostExecute(java.util.List<kaaes.spotify.webapi.android.models.Track> tracks) {
    super.onPostExecute(tracks);
    if (!(tracks.isEmpty())) {
        for (kaaes.spotify.webapi.android.models.Track track : tracks) {
            mTrackList.add(new com.example.gabrielmojica.spotify3.TrackActivityFragment.ParcelableTrack(track));
        }
        mTrackAdapter.addAll(mTrackList);
    }else {
        java.lang.String message = "Unable to find top tracks";
        android.widget.Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }
}