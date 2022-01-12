private void showAlertView(java.lang.String text) {
    android.widget.TextView showView = new android.widget.TextView(this);
    showView.setTextSize(((float) (26.0)));
    showView.setText(text);
    showView.setTextColor(Color.WHITE);
    showView.setTypeface(Typeface.DEFAULT_BOLD);
    showView.setGravity(17);
    showView.setBackgroundColor(Color.BLACK);
    setContentView(showView);
    (displayTaskNumber)++;
    android.util.Log.d("task", "task finish!");
}