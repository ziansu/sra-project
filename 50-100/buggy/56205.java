protected void buzz(android.view.View view) {
    stopTimer();
    android.widget.LinearLayout layout = ((android.widget.LinearLayout) (findViewById(R.id.onBuzzLayout)));
    android.view.ViewGroup.LayoutParams params = layout.getLayoutParams();
    params.height = android.view.ViewGroup.LayoutParams.WRAP_CONTENT;
    layout.setLayoutParams(params);
    layout = ((android.widget.LinearLayout) (findViewById(R.id.controlLayout)));
    params = layout.getLayoutParams();
    params.height = 0;
    layout.setLayoutParams(params);
}