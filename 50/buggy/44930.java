public void setLocalStyle(com.tokbox.android.otsdkwrapper.utils.VideoScale style) {
    if (style == (com.tokbox.android.otsdkwrapper.utils.VideoScale.FILL)) {
        mPublisher.setStyle(BaseVideoRenderer.STYLE_VIDEO_SCALE, BaseVideoRenderer.STYLE_VIDEO_FILL);
    }else {
        mPublisher.setStyle(BaseVideoRenderer.STYLE_VIDEO_SCALE, BaseVideoRenderer.STYLE_VIDEO_FIT);
    }
}