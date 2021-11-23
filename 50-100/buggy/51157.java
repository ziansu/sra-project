@java.lang.Override
public void onBitmapFailed(android.graphics.drawable.Drawable errorDrawable) {
    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
    options.inPreferredConfig = Bitmap.Config.RGB_565;
    android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeResource(getResources(), R.drawable.album, options);
    android.support.v4.media.MediaMetadataCompat metaData = getMediaMetaFrom(bean, bitmap);
    mediaSession.setMetadata(metaData);
    mediaSession.setActive(true);
    bob.sun.bender.utils.NotificationUtil.getStaticInstance(getApplicationContext()).showPlayingNotification(this, mediaSession);
}