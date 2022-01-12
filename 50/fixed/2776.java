protected void setView(android.widget.ImageView imageView, int image_loading, int image_error) {
    mImageView = imageView;
    if (image_loading != 0)
        mLoadingImage = image_loading;
    
    if (image_error != 0)
        mErrorImage = image_error;
    
}