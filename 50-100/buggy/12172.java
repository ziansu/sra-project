@java.lang.Override
protected void initResource(android.os.Bundle savedInstanceState) {
    setSupportActionBar(R.id.zxingscanview_toolbar);
    scanView = ((am.widget.zxingscanview.ZxingScanView) (findViewById(R.id.zxingscanview_zsv_scan)));
    foregroundView = ((am.widget.zxingscanview.ZxingForegroundView) (findViewById(R.id.zxingscanview_zfv_foreground)));
    scanView.addOnScanListener(this);
    foregroundView.setOpenDrawable(new android.support.v4.widget.MaterialLoadingProgressDrawable(foregroundView));
    scanView.addOnScanListener(new am.widget.zxingscanview.ZxingScanView.OnScanListener() {
        @java.lang.Override
        public void onError(am.widget.zxingscanview.ZxingScanView scanView) {
        }

        @java.lang.Override
        public void onResult(am.widget.zxingscanview.ZxingScanView scanView, com.google.zxing.Result result, android.graphics.Bitmap barcode, float scaleFactor) {
        }
    });
}