private void wireUI() {
    ((android.widget.Button) (findViewById(R.id.recordButton))).setOnClickListener(recordListener);
    xPane = ((android.widget.FrameLayout) (findViewById(R.id.xPane)));
    yPane = ((android.widget.FrameLayout) (findViewById(R.id.yPane)));
    zPane = ((android.widget.FrameLayout) (findViewById(R.id.zPane)));
}