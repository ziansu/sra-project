@java.lang.Override
public void run() {
    android.graphics.Bitmap bitmap = loadArtwork(artworkUrl, artworkLocal);
    md.putBitmap(MediaMetadataCompat.METADATA_KEY_ART, bitmap);
    nb.setLargeIcon(bitmap);
    session.setMetadata(md.build());
    notification.show(nb, isPlaying);
    artworkThread = null;
}