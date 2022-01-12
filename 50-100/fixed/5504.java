private void displayOptions(android.app.Activity activity, android.widget.LinearLayout container, android.widget.TextView title) {
    container.removeAllViews();
    title.setText(finger.getTitle());
    for (java.lang.String option : finger.getOptions()) {
        android.widget.TextView textView = ((android.widget.TextView) (activity.getLayoutInflater().inflate(R.layout.base_guided_input, null)));
        textView.setText(option);
        container.addView(textView);
    }
}