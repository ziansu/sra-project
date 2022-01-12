@java.lang.Override
protected void initResource(android.os.Bundle savedInstanceState) {
    setSupportActionBar(R.id.zxingscanview_toolbar);
    scanView = ((am.widget.zxingscanview.ZxingScanView) (findViewById(R.id.zxingscanview_zsv_scan)));
    foregroundView = ((am.widget.zxingscanview.ZxingForegroundView) (findViewById(R.id.zxingscanview_zfv_foreground)));
    scanView.addOnScanListener(this);
    foregroundView.setOpenDrawable(new android.support.v4.widget.MaterialLoadingProgressDrawable(foregroundView));
}