public void addMessageBox(java.lang.String message, int type) {
    android.widget.TextView textView = new android.widget.TextView(this);
    textView.setText(message);
    android.widget.LinearLayout.LayoutParams lp2 = new android.widget.LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    lp2.weight = 1.0F;
    if (type == 1) {
        lp2.gravity = android.view.Gravity.LEFT;
        textView.setBackgroundResource(R.drawable.bubble_in);
    }else {
        lp2.gravity = android.view.Gravity.RIGHT;
        textView.setBackgroundResource(R.drawable.bubble_out);
    }
    textView.setLayoutParams(lp2);
    layout.addView(textView);
    scrollView.fullScroll(View.FOCUS_DOWN);
}