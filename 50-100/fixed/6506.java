@java.lang.Override
public int getItemPosition(java.lang.Object object) {
    uk.co.senab.photoview.PhotoView imageView = ((uk.co.senab.photoview.PhotoView) (object));
    int position = mImageViews.indexOf(imageView);
    if (position == (-1)) {
        return POSITION_NONE;
    }else {
        return position;
    }
}