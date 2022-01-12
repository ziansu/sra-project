@java.lang.Override
public void onBitmapLoaded(android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom from) {
    fr.tvbarthel.cheerleader.library.client.SoundCloudTrack track = mPlayerPlaylist.getCurrentTrack();
    if (track != null) {
        if ((Build.VERSION.SDK_INT) <= (Build.VERSION_CODES.KITKAT)) {
            mMediaSession.setMetaData(mPlayerPlaylist.getCurrentTrack(), bitmap.copy(bitmap.getConfig(), false));
        }else {
            mMediaSession.setMetaData(mPlayerPlaylist.getCurrentTrack(), bitmap);
        }
    }
}