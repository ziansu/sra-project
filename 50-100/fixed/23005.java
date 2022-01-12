@java.lang.Override
public void processFinish(java.lang.Object[] result) {
    if ((result == null) || ((result.length) == 0)) {
        return ;
    }
    android.graphics.drawable.BitmapDrawable image = ((android.graphics.drawable.BitmapDrawable) (result[0]));
    if (image != null) {
        android.graphics.Bitmap bitmap = image.getBitmap();
        ((music.onestream.activity.SongActivity) (((music.onestream.activity.OneStreamApplication) (context.getApplicationContext())).getCurrentActivity())).setAlbumArt(bitmap);
    }
}