private void wireUI() {
    textView = ((android.widget.TextView) (findViewById(R.id.textView)));
    frame = ((android.widget.FrameLayout) (findViewById(R.id.parentView)));
    ((android.widget.Button) (findViewById(R.id.recordButton))).setOnClickListener(recordListener);
    xPane = ((android.widget.FrameLayout) (findViewById(R.id.xPane)));
    yPane = ((android.widget.FrameLayout) (findViewById(R.id.yPane)));
    zPane = ((android.widget.FrameLayout) (findViewById(R.id.zPane)));
}