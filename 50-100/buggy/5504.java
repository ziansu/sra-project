private void displayOptions(android.app.Activity activity, android.widget.LinearLayout container, android.widget.TextView title) {
    container.removeAllViews();
    for (java.lang.String option : finger.getOptions()) {
        title.setText(finger.getTitle());
        android.widget.TextView textView = ((android.widget.TextView) (activity.getLayoutInflater().inflate(R.layout.base_guided_input, null)));
        textView.setText(option);
        container.addView(textView);
    }
}