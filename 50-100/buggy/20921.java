@java.lang.Override
protected android.graphics.Bitmap doInBackground(java.lang.Object... params) {
    this.photo = ((android.widget.ImageView) (params[1]));
    android.os.Looper.prepare();
    android.graphics.Bitmap bitmap;
    try {
        bitmap = com.bumptech.glide.Glide.with(context).load(params[0].toString()).asBitmap().into(1920, 1080).get();
    } catch (final java.util.concurrent.ExecutionException e) {
        return null;
    } catch (final java.lang.InterruptedException e) {
        return null;
    }
    return bitmap;
}