@java.lang.Override
public void run() {
    if ((touchImageViewListener) != null) {
        touchImageViewListener.onMove();
    }
    float t = interpolate();
    float deltaScale = calculateDeltaScale(t);
    scaleImage(deltaScale, bitmapX, bitmapY, stretchImageToSuper);
    translateImageToCenterTouchPosition(t);
    fixScaleTrans();
    setImageMatrix(matrix);
    if (t < 1.0F) {
        compatPostOnAnimation(this);
    }else {
        setState(com.example.touch.TouchImageView.State.NONE);
    }
}