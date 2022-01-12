public void onClickAddSong(android.view.View view) {
    com.teinvdlugt.android.piano.Song song = new com.teinvdlugt.android.piano.Song();
    java.lang.String newKey = mSongsRef.push().getKey();
    mSongsRef.child(newKey).setValue(song);
    song.setKey(newKey);
    com.teinvdlugt.android.piano.SongActivity.openActivity(this, song, com.teinvdlugt.android.piano.Composer.getComposerNames(mSongs), com.teinvdlugt.android.piano.Song.getTags(mSongs));
}