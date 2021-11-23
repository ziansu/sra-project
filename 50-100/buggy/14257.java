public void initView(android.content.Context context) {
    mView = inflate(context, R.layout.reader_thumbnail_strip, this);
    mContainer = ((android.widget.LinearLayout) (mView.findViewById(R.id.thumbnail_strip_container)));
    mThumbnailSize = context.getResources().getDimensionPixelSize(R.dimen.reader_thumbnail_strip_image_size);
    mCountStr = context.getResources().getString(R.string.reader_label_image_count);
}