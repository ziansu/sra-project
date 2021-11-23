@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if (camera) {
        mScannerView.stopCamera();
    }
    listView.setAdapter(null);
    android.widget.FrameLayout frameLayout = findViewById(R.id.content);
    frameLayout.removeAllViews();
}