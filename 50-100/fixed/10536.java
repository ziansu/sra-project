private void setMediaSessionMetaData() {
    if ((mediaSession) == null) {
        return ;
    }
    android.support.v4.media.MediaMetadataCompat.Builder builder = new android.support.v4.media.MediaMetadataCompat.Builder().putString(MediaMetadataCompat.METADATA_KEY_ARTIST, metaDataArtist).putString(MediaMetadataCompat.METADATA_KEY_ALBUM, metaDataAlbum).putString(MediaMetadataCompat.METADATA_KEY_TITLE, metaDataTitle).putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, android.graphics.BitmapFactory.decodeResource(getResources(), R.drawable.icon));
    if ((textInterface) != null) {
        builder.putLong(MediaMetadataCompat.METADATA_KEY_DURATION, textInterface.getTotalDuration());
    }
    mediaSession.setMetadata(builder.build());
}