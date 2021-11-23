private void updateMetaData() {
    android.graphics.Bitmap albumArt = android.graphics.BitmapFactory.decodeResource(getContext().getResources(), R.mipmap.ic_launcher);
    mediaSession.setMetadata(new android.support.v4.media.MediaMetadataCompat.Builder().putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, albumArt).putString(MediaMetadataCompat.METADATA_KEY_ARTIST, activeAudio.getArtist()).putString(MediaMetadataCompat.METADATA_KEY_ALBUM, activeAudio.getAlbum()).putString(MediaMetadataCompat.METADATA_KEY_TITLE, activeAudio.getTitle()).build());
}