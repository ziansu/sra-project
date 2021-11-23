@java.lang.Override
public void run() {
    android.widget.ImageView imageView = getImageView();
    if (imageView == null) {
        return ;
    }
    float t = interpolate();
    float scale = (mZoomStart) + (t * ((mZoomEnd) - (mZoomStart)));
    float deltaScale = scale / (getScale());
    onScale(deltaScale, mFocalX, mFocalY);
    if (t < 1.0F) {
        net.archeryc.glidedemo.photoview.Compat.postOnAnimation(imageView, this);
    }
}