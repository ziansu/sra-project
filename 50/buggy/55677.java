@java.lang.Override
public void onBitmapLoaded(android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom from) {
    android.util.Log.i("TAG", "loaded bitmap");
    drawView.removeBackgroundImage();
    settings.backgroundImagePhone = bitmap;
    drawView.invalidate();
    btnRemoveImage.setVisibility(View.VISIBLE);
}