private void createImageView(int i) {
    com.angcyo.uiview.widget.RImageView imageView = new com.angcyo.uiview.widget.RImageView(getContext());
    imageView.setTag(R.id.tag_position, i);
    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    mImageViews.add(imageView);
    if (canItemClick) {
        imageView.setOnClickListener(this);
    }
    addViewInLayout(imageView, i, new com.angcyo.uiview.widget.LayoutParams((-2), (-2)));
}