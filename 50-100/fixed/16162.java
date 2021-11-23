@java.lang.Override
public void run() {
    final android.graphics.Bitmap art = com.marverenic.music.utils.ArtGrabber.grabArtistArt(context, albums.get(0).artistName);
    if (art != null) {
        handler.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                ((android.widget.ImageView) (infoHeader.findViewById(R.id.artist_image))).setImageBitmap(art);
            }
        });
    }
}