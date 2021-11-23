private void initFrameFilter() {
    if (android.text.TextUtils.isEmpty(mFilters)) {
        mFilters = rawe.gordon.com.androidrecord.recorder.Constants.generateFilters(((int) (((1.0F * (outputHeight)) / (outputWidth)) * (imageHeight))), imageHeight, 0, 0, "clock");
    }
    mFrameFilter = new org.bytedeco.javacv.FFmpegFrameFilter(mFilters, imageWidth, imageHeight);
    mFrameFilter.setPixelFormat(org.bytedeco.javacpp.avutil.AV_PIX_FMT_NV21);
}