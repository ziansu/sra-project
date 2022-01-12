@java.lang.Override
protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    if ((mNineImageConfig) != null) {
        for (int i = 0; i < (mImageViews.size()); i++) {
            com.angcyo.uiview.widget.RImageView imageView = mImageViews.get(i);
            mNineImageConfig.displayImage(imageView, mImagesList.get(i), imageView.getMeasuredWidth(), imageView.getMeasuredHeight());
        }
    }
}