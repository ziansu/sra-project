public void playTopSong() {
    cpmusic.com.crowdplay.model.firebaseModel.Track topTrack = adapter.getTopTrack();
    adapter.resetVotes(topTrack);
    recyclerView.scrollToPosition(0);
    mPlayer.playUri(null, topTrack.URI, 0, 0);
    txtArtist.setText(topTrack.Artist);
    txtTrack.setText(topTrack.Title);
    com.squareup.picasso.Picasso.with(this).load(topTrack.ImageURL).into(imgAlbum);
    setupProgressBar();
}