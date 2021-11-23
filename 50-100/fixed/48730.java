@java.lang.Override
protected void onPostExecute(java.util.ArrayList<kaaes.spotify.webapi.android.models.Artist> LoArtists) {
    super.onPostExecute(LoArtists);
    if ((LoArtists != null) && ((LoArtists.size()) == 0)) {
        android.widget.Toast.makeText(getActivity(), getActivity().getString(R.string.notificaiton_failed_search), Toast.LENGTH_SHORT).show();
        mSpotifyArtistAdapter.clearArtists();
        mSpotifyArtistAdapter.notifyDataSetChanged();
    }else {
        mLoArtist = LoArtists;
        mSpotifyArtistAdapter.replaceArtistList(mLoArtist);
        mSpotifyArtistAdapter.notifyDataSetChanged();
    }
}