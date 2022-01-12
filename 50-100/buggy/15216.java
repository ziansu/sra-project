@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((s != null) && ((s.toString().length()) > 0)) {
        if (!(s.toString().equals(currentString))) {
            android.util.Log.e("Retro", "Fetching artists");
            new com.christopherpick.anroid.spotifystreamer.fragments.ArtistListFragment.FetchArtistsTask().execute(s.toString());
            currentString = s.toString();
        }
    }else {
        mArtistAdapter.clear();
    }
}