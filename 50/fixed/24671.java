public void updateImage(android.graphics.Bitmap bitmap) {
    if ((mImageView) != null) {
        mImageView.setImageBitmap(bitmap);
    }
    mBitmap = bitmap;
}