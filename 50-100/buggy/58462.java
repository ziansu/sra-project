private void loadImage(int position, java.lang.String imagePath, android.widget.ImageView imageView) {
    android.graphics.Bitmap bitmapFromMemCache = com.xxboy.utils.XCacheUtil.getFromMemCache(imagePath);
    if (bitmapFromMemCache != null) {
        imageView.setImageBitmap(bitmapFromMemCache);
    }else {
        if (com.xxboy.common.XFunction.isImage(imagePath)) {
            new com.xxboy.services.asynctasks.XBitmapCacheAsyncTask(position, imagePath, imageView).execute();
        }else {
            imageView.setImageResource(R.drawable.ic_media_embed_play);
        }
    }
}