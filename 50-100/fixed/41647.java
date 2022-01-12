@java.lang.Override
protected void onPostExecute(java.util.List<kaaes.spotify.webapi.android.models.Artist> artists) {
    if ((artists != null) && ((artists.size()) > 0)) {
        com.udacitiy.nanodegree.spotifystage1.MainActivityFragment.adapter.clear();
        com.udacitiy.nanodegree.spotifystage1.MainActivityFragment.adapter.addAll(artists);
    }else {
        android.widget.Toast.makeText(getActivity(), "No artists found", Toast.LENGTH_LONG).show();
    }
}