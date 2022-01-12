@java.lang.Override
public int getItemPosition(java.lang.Object object) {
    uk.co.senab.photoview.PhotoView imageView = ((uk.co.senab.photoview.PhotoView) (object));
    int positon = mImageViews.indexOf(imageView);
    if (positon == (-1)) {
        return POSITION_NONE;
    }else {
        return positon;
    }
}