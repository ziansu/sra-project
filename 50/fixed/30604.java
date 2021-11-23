public static void setText(android.app.Activity activity, android.widget.TextView textView, int resId) {
    activity.runOnUiThread(() -> textView.setText(resId));
}