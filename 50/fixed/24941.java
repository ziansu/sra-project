public static void setText(android.app.Activity activity, android.widget.TextView textView, java.lang.String str) {
    activity.runOnUiThread(() -> textView.setText(str));
}