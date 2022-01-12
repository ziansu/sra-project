public void onTrackClick(java.util.ArrayList<com.hengtan.nanodegreeapp.spotifystreamer.ParcelableTrack> tracks, int trackIndex) {
    android.content.Intent intent = new android.content.Intent(this, com.hengtan.nanodegreeapp.spotifystreamer.PlayerActivity.class);
    android.os.Bundle test = new android.os.Bundle();
    test.putParcelableArrayList(PlayerFragment.TOPTENTRACKS_PARCELABLE, tracks);
    intent.putExtra(PlayerFragment.TOPTENTRACKS_PARCELABLE, tracks);
    startActivity(intent);
}