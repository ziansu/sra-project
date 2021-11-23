@java.lang.Override
public void onWindowFocusChanged(boolean hasFocus) {
    super.onWindowFocusChanged(hasFocus);
    if (!(drawingViewHasSet)) {
        int[] size = com.youzan.fingertrace.BitmapUtil.getBitmapPositionInsideImageView(imageView);
        resizeSurface(size);
        drawingViewHasSet = true;
    }
}