@java.lang.Override
public void onImageDownloaded(android.graphics.Bitmap bitmapResult) {
    mainContentImageView.setImageBitmap(bitmapResult);
    imageLoadingProgress.setVisibility(View.GONE);
    floatingActionButton.setVisibility(View.VISIBLE);
}