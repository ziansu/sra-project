@java.lang.Override
public void run() {
    if ((md) == null)
        return ;
    
    android.graphics.Bitmap bitmap = loadArtwork(artworkUrl, artworkLocal);
    if ((bitmap != null) && ((md) != null)) {
        md.putBitmap(MediaMetadataCompat.METADATA_KEY_ART, bitmap);
        nb.setLargeIcon(bitmap);
    }
    session.setMetadata(md.build());
    notification.show(nb, isPlaying);
    artworkThread = null;
}