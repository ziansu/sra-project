private void setMetaData(com.wojtechnology.sunami.FireMixtape song) {
    setProgress(0, true);
    mSession.setMetadata(new android.support.v4.media.MediaMetadataCompat.Builder().putString(MediaMetadataCompat.METADATA_KEY_TITLE, song.title).putString(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, song.artist).putLong(MediaMetadata.METADATA_KEY_DURATION, java.lang.Long.parseLong(song.duration)).build());
}