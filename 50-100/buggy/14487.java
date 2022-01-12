private void setUpViews() {
    if (org.amahi.anywhere.activity.ServerFileVideoActivity.ENABLE_SUBTITLES) {
        final android.view.ViewStub stub = ((android.view.ViewStub) (findViewById(R.id.subtitles_stub)));
        mSubtitlesSurface = ((android.view.SurfaceView) (stub.inflate()));
        mSubtitlesSurface.setZOrderMediaOverlay(true);
        mSubtitlesSurface.getHolder().setFormat(PixelFormat.TRANSLUCENT);
    }
}