@java.lang.Override
public void onSuccess(java.lang.Object result) {
    android.graphics.Bitmap resultBitmap = ((android.graphics.Bitmap) (result));
    imageCache.writeInCache(resultBitmap, imagesrc);
    handler.imageView.setImageBitmap(resultBitmap);
}